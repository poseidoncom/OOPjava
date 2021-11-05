package perinta;

import java.util.ArrayList;

public class Firma {

	public static void main(String[] args) {
		ArrayList<Tyontekija> tyontekijat = new ArrayList<Tyontekija>();

	    tyontekijat.add( new Tuntityontekija("Jokunen Jaska", 10, 160) );

	    tyontekijat.add( new Myyja("Juonio Jussi", 20, 10000) );
	    //jne.

	    for(int i=0; i<tyontekijat.size(); i++) {
	        System.out.print("Työntekijän " + tyontekijat.get(i).getNimi());
	        System.out.println(" palkka on " + tyontekijat.get(i).laskePalkka());
	    }
	}

}
