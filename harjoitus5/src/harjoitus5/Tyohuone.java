package harjoitus5;

import java.util.Scanner;

public class Tyohuone extends Huone {
	private String tyontekijat;
	
	
	
	
	public void kysyTiedot() {
		super.kysyTiedot();
		Scanner sc = new Scanner(System.in);
		tyontekijat = sc.nextLine();
	}

	
	@Override
	public String toString() {
		return "Työhuone [tyontekijat=" + tyontekijat + ", getTunnus()=" + getTunnus() + ", getKuvaus()="
				+ getKuvaus() + "]";
	}

	
	
	

}
