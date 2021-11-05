package harjoitus5;

import java.util.ArrayList;

public class PreferredCustomer extends Customer {
	private double purchases;
	
	public static void main (String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"Mikko Mallikas", "Wolffintie 23"));
		customers.add(new PreferredCustomer(1,"Mainio Etuasiakas", "Wolffintie 34", 2009.0));
		
		System.out.println("Asiakkaiden tiedot:");
		
		 for(Customer cu: customers){
	            System.out.println(cu);
	        }
		 
		 System.out.println("Etuasiakkaiden tiedot sekä alennusprosentti:");
		 
		 for(Customer cu: customers){
			 if (cu instanceof PreferredCustomer) {
				 System.out.println(cu.toString());
			 }
	            
	        }
		
	}
	
	
	

	public PreferredCustomer(int customerNumber, String name, String address, double purchases) {
		super(customerNumber, name, address);
		this.purchases = purchases;
	}




	public PreferredCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double bonus(){
		int bonusPercent;
		if (this.purchases > 500 && this.purchases<=1000) {
			bonusPercent = 2;
		}
		else if (this.purchases > 1000) {
			bonusPercent = 5;
		}
		else {
			bonusPercent = 0;
		}
		return purchases*bonusPercent;
	}

	public double getPurchases() {
		return purchases;
	}

	public void setPurchases(double purchases) {
		this.purchases = purchases;
	}
	

	@Override
	public String toString() {
		return "PreferredCustomer [Purchases=" + purchases + ", Customer Number=" + getCustomerNumber()
				+ ", Name=" + getName() + ", Address=" + getAddress() + "]";
	}
	
	
}
