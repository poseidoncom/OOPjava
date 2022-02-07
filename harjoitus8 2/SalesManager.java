
//--------------------
//SalesManager.java
//--------------------
/*
 * SalesManager: salary is based on monthly salary, commission percent, and sales
 */
@SuppressWarnings("serial")
public class SalesManager extends SalesEmployee {
	
	private double monthlySalary;
	
	public SalesManager() {}
	
	public SalesManager(String name, double monthlySalary, double sales, double commissionPercent) {
		super(name, sales, commissionPercent);
		this.monthlySalary = monthlySalary;
	}

	public double calculateSalary(){
		return monthlySalary + super.calculateSalary();
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String toString() {
    	return "Sales manager: " + getName() + ", monthly salary " + monthlySalary + " €, sales " +getSales() 
    		+ " €, commission percent " + getCommissionPercent() + " %";
    }
	
}