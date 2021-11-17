package perinta;

public class Tuntityontekija extends Tyontekija {
	   private double tuntipalkka, tunnit;

	   public Tuntityontekija(String nimi, double tuntipalkka, double tunnit) {
	      super(nimi); //kutsuu Tyontekija-luokan konstruktoria
	      this.tunnit = tunnit;
	      this.tuntipalkka = tuntipalkka;
	   }

	   public void setTuntipalkka(double tuntipalkka) {
	      this.tuntipalkka = tuntipalkka;
	   }

	   public void setTunnit(double tunnit) {
	      this.tunnit = tunnit;
	   }
	   //Aliluokan on pakko toteuttaa kantaluokan abstrakti metodi 
	   public double laskePalkka() {
	      return tunnit*tuntipalkka;
	   }
	}