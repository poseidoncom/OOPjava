package perinta;

import java.util.ArrayList;

public class Henkiloauto extends Ajoneuvo {
	   public int ovienLukumaara;
	   
	   public static void main(String[] args) {
		   Henkiloauto lexus = new Henkiloauto();
		   lexus.ovienLukumaara=5;
		   //osa ominaisuuksista tulee kantaluokalta
		   lexus.omistajanNimi="Aku Ankka";
		   lexus.vaihdaOmistaja("Iines Ankka");
		   System.out.println("Reknro " + lexus.rekisterinumero + ", omistaja "
					+ lexus.omistajanNimi + ", ovien lkm " + lexus.ovienLukumaara);
		   Ajoneuvo omaAjoneuvo = lexus;
		   
		   Moottoripyora ariel = new Moottoripyora();
		   
		   Ajoneuvo omaToinenAjoneuvo = ariel;
		   System.out.println(omaToinenAjoneuvo.getClass());
		   System.out.println(omaAjoneuvo.getClass());
		   ArrayList<Ajoneuvo> kalusto = new ArrayList<>();
		   kalusto.add(new Henkiloauto());
		   kalusto.add(new Moottoripyora());
		   kalusto.add(new Henkiloauto());
		   kalusto.add(new Moottoripyora());
		   kalusto.add(new Henkiloauto());
		   kalusto.add(new Moottoripyora());
		   for(Ajoneuvo a:kalusto) {
			   System.out.println(a.getClass());
		   }
	   }
	   
	}
