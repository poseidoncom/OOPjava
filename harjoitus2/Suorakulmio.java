package fi.vamk.olioohjelmointi.harjoitus2;

import fi.vamk.olioohjelmointi.harjoitus2.Suorakulmio;

public class Suorakulmio {
	private double X_ala;
	private double Y_ala;
	private double X_yla;
	private double Y_yla;

	public static void main(String[] args) {
		Suorakulmio s1 = new Suorakulmio();
		Suorakulmio s2 = new Suorakulmio(2,3);
		System.out.println(s1.kanta());
		System.out.println(s1.korkeus());
		System.out.println(s1.ala());
		
		System.out.println(s2.kanta());
		System.out.println(s2.korkeus());
		System.out.println(s2.ala());
		
		
		

	}
	public Suorakulmio() {
		X_ala = 0;
		Y_ala = 0;
		X_yla = 1;
		Y_yla = 1;
	}
	
	public Suorakulmio(double _X_yla, double _Y_yla) {
		X_ala = 0;
		Y_ala = 0;
		X_yla = _X_yla;
		Y_yla = _Y_yla;
	}
	
	public double kanta() {
		return(X_yla-X_ala);
	}
	
	public double korkeus() {
		return(Y_yla-Y_ala);
	}
	
	public double ala() {
		return(kanta()*korkeus());
		
	}
	

}
