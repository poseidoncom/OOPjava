package harjoitus4;

import java.util.StringTokenizer;

public class Paivamaara {
	private int paiva;
	private int kuukausi;
	private int vuosi;
	public static final String[] KUUKAUDET = {"tammikuu", "helmikuu",
			"maaliskuu", "huhtikuu", "toukokuu", "kesäkuu", "heinäkuu", "elokuu",
			"syyskuu", "lokakuu", "marraskuu", "joulukuu"};

	//Kirjoita parametriton konstruktori, joka alustaa päivämäärän järjestelmän päivämäärällä
	public Paivamaara() {
		java.time.LocalDate tanaan = java.time.LocalDate.now();
		paiva = tanaan.getDayOfMonth();
		kuukausi = tanaan.getMonthValue();
		vuosi = tanaan.getYear();	
	}
	//Kirjoita konstruktori, jolle välitetään päivä, kuukausi ja vuosi kokonaislukuparametreina.
	public Paivamaara(int pv, int kk, int vv) {
		paiva = pv;
		kuukausi = kk;
		vuosi = vv;	
	}
	//Kirjoita konstruktori, jolle välitetään päivämäärä merkkijonona ”pp.kk.vvvv”
	public Paivamaara(String dateString) {
		//StringTokenizer osaa pilkkoa annetun merkkijonon annetulla erotinmerkillä
		StringTokenizer st = new StringTokenizer(dateString, ".");
		paiva = Integer.parseInt(st.nextToken());
		kuukausi= Integer.parseInt(st.nextToken());
		vuosi= Integer.parseInt(st.nextToken());
	}

	public int getPaiva() {
		return paiva;
	}

	public void setPaiva(int paiva) {
		this.paiva = paiva;
	}

	public int getKuukausi() {
		return kuukausi;
	}

	public void setKuukausi(int kuukausi) {
		this.kuukausi = kuukausi;
	}

	public int getVuosi() {
		return vuosi;
	}

	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	@Override
	public String toString() {
		return paiva + "." + kuukausi + "." + vuosi ;
	}
	
	// Kirjoita metodi public boolean onSama(Paivamaara toinen), joka palauttaa totuusarvon
	public boolean onSama(Paivamaara toinen) {
		return this.toString().equals(toinen.toString()); //String on merkkijono-olio, pitää verrata näin
	}
	
	//Kirjoita luokkaan instanssimetodi, joka palauttaa päivämäärän merkkijonona pitkässä muodossa, esim. 
	public String getLongDate() {
		return paiva + ". " + KUUKAUDET[kuukausi-1] + "ta, " + vuosi;
	}
	//Kirjoita luokkametodi, jolle välitetään parametrina kuukauden nimi merkkijonona, ja metodi palauttaa
	//kuukauden numeron
	public static int getMonthNumberOfWeek(String _month) {
		String month = _month.toLowerCase();
		int vastaus=-1;
		for(int i=0;i<KUUKAUDET.length;i++) {
			if(KUUKAUDET[i].equals(month)) {
				vastaus= i+1;
			}
		}
		return vastaus;
	}
}
