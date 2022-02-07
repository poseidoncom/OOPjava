package harjoitus4;

public class DistributionPrinter{
	//attribuutiksi  Määrittele instanssimuuttujaksi viite
	//tulostettavaan jakaumaolioon 
	private Distribution dist;
	//tee konstruktori ja välitä tulostettava jakauma konstruktorille parametrina

	public DistributionPrinter(Distribution d) {
		super();
		this.dist = d;
	}
	
	public void printDistribution() {
		
		int min=this.dist.getMin();
		int max=this.dist.getMax();
		
		for (int i = min; i<=max; i++) {
			System.out.println(i +"\t"+ this.dist.frequency(i));
			
		}
		System.out.println("Esiintymien lukumäärä: "+this.dist.getCount()+" ja keskiarvo"+ this.dist.average());
		
	}

	// Kirjoita metodi, 	joka tulostaa lukujen min..max esiintymien lukumäärät ja keskiarvon. 
	//esim public void printDistribution()
	//siis 
	//1  2
	//2  2
	//3  2
	//4  0
	//5  0
	//esiintymien lukumäärä 6 ja keskiarvo 3 
	public static void main(String[] args) {
		
		Distribution d = new Distribution(1,5);
		d.insertValue(1);
		d.insertValue(1);
		d.insertValue(2);
		d.insertValue(2);
		d.insertValue(3);
		d.insertValue(3);
		DistributionPrinter dp1 = new DistributionPrinter(d);
		dp1.printDistribution();
		
		
	}


}

