
public class Ympyra implements Measurable {

    private double x;     //ympyrän keskipisteen x-koordinaatti
    private double y;     //ympyrän keskipisteen y-koordinaatti
    private double sade;  //ympyrän säde
	
    public Ympyra() {
        this.x = 0;
        this.y = 0;
        this.sade = 1;
    }
	
    public Ympyra(double sade) {
        this.x = 0;
        this.y = 0;
        this.sade = Math.abs(sade); 
    }
	
    public Ympyra(double x, double y, double sade) {
        this.x = x;
        this.y = y;
        this.sade = Math.abs(sade);
    }
	
    public void setSade(double sade) {
        this.sade = Math.abs(sade);   //säde ei saa olla negatiivinen
    }
	
    public void setX(double x) {
        this.x = x;
    }
	
    public void setY(double y) {
        this.y = y;
    }
	
    public double getSade() {
        return sade;
    }
	
    public double getX() {
        return x;
    }
	
    public double getY() {
        return y;
    }
	
    public double pintaAla() {
        return Math.PI * sade * sade;
    }
	
    //Leikkaako ympyrä toista ympyrää
    public boolean leikkaa(Ympyra toinen) {
        //Jos keskipisteiden etäisyys on pienempi (tai yhtäsuuri) 
        //kuin säteiden summa, niin ympyrät leikkaavat (tai sivuavat).
        double d = Math.sqrt((x-toinen.x)*(x-toinen.x)+(y-toinen.y)*(y-toinen.y));
        return d <= sade + toinen.sade;
    }

	@Override
	public double area() {
		
		return this.pintaAla();
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.sade;
	}

	@Override
	public void scale(double scaleValue) {
		this.sade = this.sade * scaleValue;
		
	}
} //Ympyra-luokka päättyy
