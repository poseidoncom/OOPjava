import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Paivamaara implements Comparable<Paivamaara> {
private int paiva, kuukausi, vuosi;
	public static void main(String[] args) {
		
		ArrayList<Paivamaara> paivamaarat = new ArrayList<Paivamaara>();
		
		paivamaarat.add(new Paivamaara(26, 04, 1999));
		paivamaarat.add(new Paivamaara(24, 04, 1998));
		paivamaarat.add(new Paivamaara(27, 04, 1999));
		paivamaarat.add(new Paivamaara(26, 04, 2000));
		paivamaarat.add(new Paivamaara(26, 04, 2001));
		paivamaarat.add(new Paivamaara(30, 02, 1996));
		Collections.sort(paivamaarat);
		
		for(Paivamaara p: paivamaarat) {
            System.out.println(p.toString());
        }
		
		System.out.println("Syötä päivämäärä, jonka jälkeiset päivämäärät haluat löytää: ");
		Scanner sc = new Scanner(System.in);
		
		
		Paivamaara pvm = new Paivamaara(sc.nextLine());
		
		for(Paivamaara p: paivamaarat) {
			if(p.compareTo(pvm)==1) {
				System.out.println(p.toString());
			}
		}
		
		
		
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

	@Override
	public int compareTo(Paivamaara pvm) {
		if(this.vuosi > pvm.vuosi) {
			return 1;
		}
		
		
		else if(this.vuosi == pvm.vuosi) {
			if(this.kuukausi == pvm.kuukausi) {
				if(this.paiva == pvm.paiva) {
					return 0;
				}
				else if(this.paiva > pvm.paiva) {
					
					return 1;
				}
				else {
					return -1;
				}
			}
			else if (this.kuukausi > pvm.kuukausi) {
				return 1;
			}
			else {
				return -1;
			}
		}
		
		return -1;
		
		
	}
}
