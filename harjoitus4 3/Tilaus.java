package harjoitus4;

import java.util.ArrayList;

public class Tilaus {
	private String tilausnumero, asiakkaan_nimi, pvm;
	ArrayList <Tilausrivi> tilausrivit = new ArrayList<Tilausrivi>();
	
	
	
	
	public Tilaus(String tilausnumero, String asiakkaan_nimi, Paivamaara pvm) {
		super();
		this.tilausnumero = tilausnumero;
		this.asiakkaan_nimi = asiakkaan_nimi;
		this.pvm = pvm.toString();
	}

	public void addTilausrivi(Tilausrivi rivi) {
		tilausrivit.add(rivi);
	}
	
	public double getHinta() {
		double hinta = 0;
		for(Tilausrivi rivi: tilausrivit ) {
			hinta += rivi.hintaYhteensa();
		}
		return hinta;
	}
	
	public String getTilauksenTiedot() {
		StringBuilder tilauksenTiedot = new StringBuilder();
		tilauksenTiedot.append("Tilausnumero: "+ tilausnumero+"\nAsiakkaan nimi: "+asiakkaan_nimi+"\nPäivämäärä: "+pvm+"\n");
		tilauksenTiedot.append("Tuote\t\tHinta\tMäärä\tSumma\n");
		for(Tilausrivi rivi: tilausrivit) {
			tilauksenTiedot.append(rivi.getNimi()+"\t\t"+rivi.getHinta()+"\t"+rivi.getTilausMaara()+"\t"+rivi.hintaYhteensa()+"\n");
		}
		tilauksenTiedot.append("Yhteishinta:\t"+getHinta());
		
		String tiedot = tilauksenTiedot.toString();
		
		
		return tiedot;
	}


	//Kirjoita konstruktori, jolla saadaan asetettua
	//tilausnumero, asiakkaan nimi ja tilauksen päivämäärä
	
	//Kirjoita luokkaan metodi, jolla tilaukseen voidaan lisätä uusi tilausrivi. 
	
	
	//Kirjoita metodi, joka laskee koko tilauksen kokonaishinnan.
	
	//Kirjoita myös metodi, joka palauttaa tilauksen tiedot yhtenä pitkänä merkkijonona. Merkkijono
	//rakennetaan StringBuilderin avulla.
	//esim public String getTilauksenTiedot(){...}
	
	//Kokeile lyhyellä main-metodilla luokan toimintaa (ei tarvitse kysyä tietoja käyttäjältä).
	public static void main(String[] args) {
		Tilaus t1 = new Tilaus("123","Jarkko Pentikäinen",new Paivamaara("13.11.2021"));
		t1.addTilausrivi(new Tilausrivi("Kynä",2.0, 3));
		t1.addTilausrivi(new Tilausrivi("Kumi",2.5, 3));
		System.out.println(t1.getTilauksenTiedot());
		
	}
}
