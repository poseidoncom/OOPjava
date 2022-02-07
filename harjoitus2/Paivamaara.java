package fi.vamk.olioohjelmointi.harjoitus2;

import java.util.Scanner;

public class Paivamaara {
private int paiva, kuukausi, vuosi;
	public static void main(String[] args) {
		Paivamaara pvm1 = new Paivamaara();
		System.out.println(pvm1);
		Paivamaara pvm2= new Paivamaara(26, 04, 1999);
		Paivamaara pvm5= new Paivamaara("26.04.1999");
		System.out.println(pvm5);
		System.out.println(pvm2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Syötä päivämäärä muodossa pp.kk.vvvv:");
		Paivamaara pvm3 = new Paivamaara(sc.nextLine());
		System.out.println(pvm3);
		pvm3.onSama(pvm2);
		System.out.println(pvm3.kuukaudenNimi());
		System.out.println(kuukaudenNumero("toUKOkuu"));
		System.out.println(kuukaudenNumero("jokakuu"));
		sc.close();
	}
	public static final String[] KUUKAUDET = {"tammikuu", "helmikuu",  
			"maaliskuu", "huhtikuu", "toukokuu", "kesäkuu", "heinäkuu", "elokuu",  
			"syyskuu", "lokakuu", "marraskuu", "joulukuu"};
	
	public String kuukaudenNimi() {
		String _kk = String.valueOf(KUUKAUDET[this.kuukausi-1]);
		return(this.paiva+"."+_kk+"."+this.vuosi);
	}
	
	public static int kuukaudenNumero(String _kknimi) {
		_kknimi=_kknimi.toLowerCase();
		int kk = 1;
		int i;
		for (i=0; i< KUUKAUDET.length; i++) {
			if (KUUKAUDET[i].equals(_kknimi)) {
				kk = kk +i;
				break;
				
			}
			
			else {
				continue;
			}
		}
		if (i>=12) {
			return(-1);
		}
		
		else{
			return(kk);
		}
	}
	
	
	
	public Paivamaara() {
		java.time.LocalDate tanaan = java.time.LocalDate.now(); 
		paiva = tanaan.getDayOfMonth(); 
		kuukausi = tanaan.getMonthValue(); 
		vuosi = tanaan.getYear();
	}
	
	public Paivamaara(int _paiva, int _kuukausi, int _vuosi) {
		paiva = _paiva;
		kuukausi = _kuukausi;
		vuosi = _vuosi;
	}
	
	public Paivamaara(String _paivamaara) {
		paiva = Integer.parseInt(_paivamaara.substring(0,2));
		kuukausi = Integer.parseInt(_paivamaara.substring(3,5));
		vuosi = Integer.parseInt(_paivamaara.substring(6,10));
	}
	public boolean onSama(Paivamaara toinen) {
		
		if(this.toString().equals(toinen.toString())){

	
			System.out.println("On sama kuin "+toinen);
			return(true);
		}
	System.out.println("Ei ole sama kuin "+toinen);
	return(false);
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
	
	public String toString() {
		return(paiva+"."+kuukausi+"."+vuosi);
	}

}
