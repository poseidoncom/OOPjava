package harjoitus4;

import java.util.Scanner;

public class Arvosanajakauma {

	public static void main(String[] args) {
		Distribution d = createDistribition();
		DistributionPrinter dp = new DistributionPrinter(d); //konstriktori puuttuu vielä
		dp.printDistribution(); //metodi puuttuu vielä
	}
	
	public static Distribution createDistribition() {
		//luo Distribution olio
		Distribution d1=new Distribution(1,5);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Syötä arvosana väliltä 1-5. Lopeta syöttö syöttämällä -1: ");
			int arvo = sc.nextInt();
			
			
			if (arvo >= 1 && arvo <=5) {
				d1.insertValue(arvo);
			}
			
			else {
				System.out.println("Arvo ei välillä 1-5, lopetetaan...");
				break;
			}
			
			
		}
		
		//käytä scanneria ja kysy käyttäjiltä kokonaislukuja
		
		//lisää arvo distribution olioon sen insertValuen avulla
		
		//lopuksi palauta (return) distribution
		return d1;
	}
	
	

}
