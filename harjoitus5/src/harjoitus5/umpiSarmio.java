package harjoitus5;

public class umpiSarmio extends Sarmio {
	private double tiheys;
	
	
	public static void main(String[] args) {
		umpiSarmio sarmio1 = new umpiSarmio(); //luodaan oliot
		
		sarmio1.leveys = 4;//määritellään mitat
		
		sarmio1.pituus = 2;
		
		sarmio1.korkeus = 6;
		
		sarmio1.tiheys= 3;
		
		
		
		System.out.println("tilavuus: "+sarmio1.tilavuus()+" massa: "+sarmio1.massa()); //tulostetaan mitat
		
		
	}
	
	
	
	public double massa() {
		double m = this.tiheys*this.tilavuus();
		return m;
		
	}
}
