package fi.vamk.olioohjelmointi.harjoitus3.harjoitus3;

import java.util.ArrayList;
import java.util.Scanner;

public class Harjoitus3Tehtava1 {
	
	public static void main(String[] args) {
		kysyPaivamaariaJaTalletaArrayListaan();
		tulostaPaivamaarat();
		System.out.println(palautaAnnetunVuodenPaivamaarat());
		System.out.println(tulostaAnnetunPaivamaaranIndeksi());
		
	}
	//käytetään taulukon sijaan ArrayList indeksoitua kokoelmaa
	//käytetään Harjoitus2 Paivamaara-luokkaa, joka valmiina
	private static ArrayList<Paivamaara> paivamaarat = new ArrayList<>();
	
	public static void kysyPaivamaariaJaTalletaArrayListaan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Syötä päivämäärä: ");
		
		while(true) {
			String pvm = sc.nextLine();
			if(pvm.equals("")) {
				break;
			}
			else {
				paivamaarat.add(new Paivamaara(pvm));
			}
		}
		
	}
		
	public static void tulostaPaivamaarat() {
		for(Paivamaara pvm:paivamaarat) {
			System.out.println(pvm.toString());
		}
	}
	//Ohjelma kysyy käyttäjältä vuosiluvun ja tulostaa ArrayList-kokoelmasta kaikki kyseisen vuoden
	//päivämäärät. 
	public static String palautaAnnetunVuodenPaivamaarat() {
		String result="";
		Scanner sc = new Scanner(System.in);
		int pvm = sc.nextInt();
		for(int i = 0; i < paivamaarat.size(); i++){
			if (pvm == paivamaarat.get(i).getVuosi()) {
				result += paivamaarat.get(i).toString()+"\n";
			}
            
        }
		
		return result;
	}

	//Ohjelma kysyy etsittävän päivämäärän ja ilmoittaa, missä indeksikohdassa päivämäärä on kokoelmassa
	//tai ettei päivämäärää löytynyt. Käytä hyväksi kirjoittamaasi onSama-metodia. 
	public static int tulostaAnnetunPaivamaaranIndeksi() {
		Scanner sc = new Scanner(System.in);
		int result = -1;
		Paivamaara pvm = new Paivamaara(sc.nextLine());
		for(int i = 0; i < paivamaarat.size(); i++){
			if (pvm.onSama(paivamaarat.get(i))) {
				result = i;
			}
		}
		return result;
	}
	
	/** Testausta varten tarvitaan metodi, jolla merkkijono lisätään luokan attribuuttina olevaan ArrayListaan*/
	public void addDate(String date) {
		Paivamaara pvm = new Paivamaara(date);
		paivamaarat.add(pvm);
	}
	
	/** Testausta varten tarvitaan myös metodi, joka osaa palauttaa ArrayListan*/
	public ArrayList<Paivamaara> getPaivamaarat(){
		return paivamaarat;
	}

}
