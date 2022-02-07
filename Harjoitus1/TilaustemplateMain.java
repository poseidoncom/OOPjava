
public class TilaustemplateMain {
	public static void main(String[] args) {
		Tilaustemplate tilaus1 = new Tilaustemplate();
		tilaus1.setNimi("reppu");
		tilaus1.setHinta(59.90);
		tilaus1.setTilausmäärä(10);
		System.out.println(tilaus1.getNimi());
		System.out.println(tilaus1.getHinta()+" euroa");
		System.out.println(tilaus1.getTilausmäärä()+" kpl");
		
		System.out.println("Tilauksen arvo yhteensä: "+tilaus1.yhteensa());
		
	}
}
