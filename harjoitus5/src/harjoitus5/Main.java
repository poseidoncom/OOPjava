package harjoitus5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Huone> huoneet = new ArrayList<Huone>();
	
	public static void main(String[] args) {
		int input;
		String tunnus;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		switch (input) {
			case 1:
				System.out.println("Lisätään luokkahuone, syötä luokan tunnus:");
				tunnus=sc.nextLine();
				lisaaLuokkahuone(tunnus, );
				break;
			case 2: 
				lisaaTyohuone();
				break;
			case 3:
				lisaaMuuhuone();
				break;
			
			default:
				
		}
	}

	public static void lisaaLuokkahuone() {
		huoneet.add();
	}
	
	public static void lisaaTyohuone() {
		
	}
	public static void lisaaMuuhuone() {
		huoneet.add(new Huone("a25","moi"));
	}
}

