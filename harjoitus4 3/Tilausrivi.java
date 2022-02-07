package harjoitus4;

public class Tilausrivi {
	private String nimi;
	private double hinta;
	private int tilausMaara;
	
	

	public Tilausrivi(String nimi, double hinta, int tilausMaara) {
		super();
		this.nimi = nimi;
		this.hinta = hinta;
		this.tilausMaara = tilausMaara;
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

	public int getTilausMaara() {
		return tilausMaara;
	}

	public void setTilausMaara(int tilausMaara) {
		this.tilausMaara = tilausMaara;
	}
	
	public double hintaYhteensa() {
		return hinta*tilausMaara;
	}
	
	@Override
	public String toString() {
		return "Tilausrivi [nimi=" + nimi + ", hinta=" + hinta + ", tilausMaara=" + tilausMaara + "]";
	}

	
}
