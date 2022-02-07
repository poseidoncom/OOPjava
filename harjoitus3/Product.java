package product;
import java.util.HashMap;
import java.util.Scanner;
public class Product {
	private int number;
	private double price;
	
	//luo getterit ja setterit ja kaksi konstrukstoria, tyhjä ja (int, double)
	
	private static HashMap<String, Product> products = new HashMap<>();
	public static void main(String[] args) {
		Product p = new Product();
		p.addProducts();
		askPrice();
	}
	
	
	public Product(int number, double price) {
		super();
		this.number = number;
		this.price = price;
	}


	public Product() {
		super();
		this.number = 123;
		this.price =12.5;
		
	}


	public void addProducts() {
		products.put("100", this);
	}

	public static void askPrice() {
		//TODO
		//kysy käyttäjältä tuotteen koodia ja käytä getPriceForHashTableProduct(...) hinnan hakemiseen
		System.out.println("Hae koodilla: ");
		String koodi;
		Scanner sc = new Scanner(System.in);
		koodi = sc.nextLine();
		getPriceForHashTableProduct(koodi);
		
	}
	
	public static double getPriceForHashTableProduct(String findMe) {
		//TODO hae HashTablesta oikea tuote ja palauta sen hinta
		if(products.containsKey(findMe)) {
			System.out.println(products.get(findMe).getPrice());
		}
		
		
		return 0;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [number=" + number + ", price=" + price + "]";
	}
	
}
