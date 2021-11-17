package perinta;

public abstract class Tyontekija {
	   private String nimi; //työntekijän nimi

	   public Tyontekija(String nimi) { //konstruktori
	      this.nimi = nimi;
	   }

	   public String getNimi() {
	      return nimi;
	   }

	   public abstract double laskePalkka();
	}
