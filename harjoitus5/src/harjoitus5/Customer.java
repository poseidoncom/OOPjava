package harjoitus5;

public class Customer {
	private int customerNumber;
	private String name;
	private String address;
	
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerNumber, String name, String address) {
		super();
		this.customerNumber = customerNumber;
		this.name = name;
		this.address = address;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
