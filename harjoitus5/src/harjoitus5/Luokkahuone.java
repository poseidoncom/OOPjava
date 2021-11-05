package harjoitus5;

import java.util.Scanner;

public class Luokkahuone extends Huone {
	private int istumapaikat;
	private int tietokoneet;
	private boolean videotykki;
	
	public void kysyTiedot() {
		super.kysyTiedot();
		Scanner sc = new Scanner(System.in);
		istumapaikat = sc.nextInt();
		tietokoneet = sc.nextInt();
		videotykki = sc.nextBoolean();
		
	}

	@Override
	public String toString() {
		return "Luokkahuone [istumapaikat=" + istumapaikat + ", tietokoneet=" + tietokoneet + ", videotykki="
				+ videotykki + ", getTunnus()=" + getTunnus() + ", getKuvaus()=" + getKuvaus() + "]";
	}
	
	
}
