package harjoitus5;

import java.util.Scanner;

public class Huone {
	private String tunnus;
	private String kuvaus;
	
	public void kysyTiedot() {
		Scanner sc = new Scanner(System.in);
		tunnus = sc.nextLine();
		kuvaus = sc.nextLine();
		sc.close();
	}
	
	public String getTunnus() {
		return tunnus;
	}
	public String getKuvaus() {
		return kuvaus;
	}
	@Override
	public String toString() {
		return "Huone [tunnus=" + tunnus + ", kuvaus=" + kuvaus + "]";
	}
	
}
