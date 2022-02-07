package harjoitus4;

public class Noppa {
	private int luku;
	
	public Noppa() {
		luku=(int)(Math.random()*6)+1;
	}
	
	public int getLuku() {
		return luku;
	}
	
}
