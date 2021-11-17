package perinta;

import java.util.ArrayList;

public class Auto {
	//Esimerkki kooste suhteesta
	private ArrayList<Ovi> ovet = new ArrayList<>();
	public static void main(String[] args) {
		Auto lexus = new Auto();
		Ovi ovi1 = new Ovi();
		Ovi ovi2 = new Ovi();
		Ovi ovi3 = new Ovi();
		Ovi ovi4 = new Ovi();
		Ovi ovi5 = new Ovi();
		lexus.ovet.add(ovi5);
		lexus.ovet.add(ovi4);
		lexus.ovet.add(ovi3);
		lexus.ovet.add(ovi2);
		lexus.ovet.add(ovi1);
	}
	
	public void avaaIkkuna(Ovi ovi) {
		ovet.get(0).avaa();
	}
}
