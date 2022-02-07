package harjoitus4;

import java.util.Scanner;

public class NoppaJakauma {
	public static void main(String[] args) {
		Distribution d  = teeHeitot();
		DistributionPrinter dp = new DistributionPrinter(d); //konstriktori puuttuu vielä
		dp.printDistribution(); //metodi puuttuu vielä
	}
	
	public static Distribution teeHeitot() {
		//kysy montako kertaa heitetään
		Distribution dist = new Distribution(1,6);
		
		System.out.println("Montako kertaa heitetään?: ");
		Scanner sc = new Scanner(System.in);
		int heitot = sc.nextInt();
		
		for(int i= 0; i<heitot; i++){
			
			dist.insertValue(new Noppa().getLuku());
		}
		
		return dist;
		}
		
		//lue scannerilla heittokerrat
		
		//arvo haluttu määrä, lisää tulokset Distribution -olioon
		// tyyliin distribution.insertInt(new Noppa().getLuku())
		
	}
