
public class Sarmio {
	
public double leveys;
public double pituus;
public double korkeus;

	public static void main(String[] args) {
		Sarmio sarmio1 = new Sarmio(); //luodaan oliot
		Sarmio sarmio2 = new Sarmio();
		
		sarmio1.leveys = 4;//määritellään mitat
		sarmio2.leveys = 3;
		
		sarmio1.pituus = 2;
		sarmio2.pituus = 4;
		
		sarmio1.korkeus = 6;
		sarmio2.korkeus = 2;
		
		System.out.println("leveys: "+sarmio1.leveys+" pituus: "+sarmio1.pituus+" korkeus: "+sarmio1.korkeus); //tulostetaan mitat
		System.out.println("leveys: "+sarmio2.leveys+" pituus: "+sarmio2.pituus+" korkeus: "+sarmio2.korkeus);
		
		System.out.println("Särmiön 1 tilavuus: "+sarmio1.tilavuus());//tulostetaan tilavuudet
		System.out.println("Särmiön 2 tilavuus: "+sarmio2.tilavuus());
		
	}

	public double tilavuus() { //metodi joka palauttaa tilavuuden
		
		return(leveys*pituus*korkeus);
		
	}
}
