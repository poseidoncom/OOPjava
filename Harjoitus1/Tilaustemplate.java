
public class Tilaustemplate {
	private String nimi;
	private double hinta;
	private int tilausmäärä;
	
	
	public double yhteensa() {
		return(hinta*tilausmäärä);
	}


	public String getNimi() {
		return nimi;
	}


	public void setNimi(String nimi) {
		this.nimi = nimi;
	}


	public double getHinta() {
		return hinta;
	}


	public void setHinta(double hinta) {
		this.hinta = hinta;
	}


	public int getTilausmäärä() {
		return tilausmäärä;
	}


	public void setTilausmäärä(int tilausmäärä) {
		this.tilausmäärä = tilausmäärä;
	}
	
}
