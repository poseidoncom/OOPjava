import java.util.Scanner;

public class TilaustemplateMain2 {

static double yhteensa;	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Syötä tilausrivien määrä: ");
		int rivienlkm = sc.nextInt();
		Tilaustemplate[] tilausrivit = new Tilaustemplate[rivienlkm];
		for(int i=0; i<rivienlkm; i++ ) {
			sc.nextLine();
			tilausrivit[i] = new Tilaustemplate();
			System.out.println("Tuotteen nimi: ");
			tilausrivit[i].setNimi(sc.nextLine());
			
			System.out.println("Tuotteen hinta: ");
			tilausrivit[i].setHinta(sc.nextDouble());
			
			System.out.println("Tuotteen tilausmäärä: ");
			tilausrivit[i].setTilausmäärä(sc.nextInt());
			
		}
		
		for(int i=0; i<rivienlkm; i++) {
			System.out.println(tilausrivit[i].getNimi()+" "+ tilausrivit[i].getHinta()+" "+ tilausrivit[i].getTilausmäärä()+" "+ tilausrivit[i].yhteensa());
			yhteensa = (yhteensa + tilausrivit[i].yhteensa());
		}
		System.out.println("Koko tilauksen yhteishinta: "+yhteensa);

	}

}
