package perinta;

public class Poliisi {
	//Esimerkki use-suhteesta
	public void sakota(Auto a) {
		kirjoitaSakkolappu(a);
	}
	
	public void kirjoitaSakkolappu(Auto a) {
		System.out.println("Sakko 175e" + a.toString());
	}
	
	
}
