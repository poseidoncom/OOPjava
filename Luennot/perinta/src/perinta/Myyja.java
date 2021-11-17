package perinta;

public class Myyja extends Tyontekija {
	   private double provisiopros, myynnit;

	   public Myyja(String nimi, double provisiopros, double myynnit) {
	      super(nimi); //kutsuu Tyontekija-luokan konstruktoria
	      this.provisiopros = provisiopros;
	      this.myynnit = myynnit;
	   }

	   public void setProvisiopros(double provisiopros) {
	      this.provisiopros = provisiopros;
	   }

	   public void setMyynnit(double myynnit) {
	      this.myynnit = myynnit;
	   }

	   public double laskePalkka() {
	      return provisiopros/100 * myynnit;
	  }
	}