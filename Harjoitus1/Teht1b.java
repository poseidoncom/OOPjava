import java.util.Scanner;

public class Teht1b {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kuinka monta merkkijonoa haluat syöttää?(1-100): ");
		int koko = scanner.nextInt();
		String[] taulukko = new String[koko];
		scanner.nextLine();
		for(int i=0; i<taulukko.length; i++) {
			
			System.out.println("Syötä merkkijono "+ (i+1));
		
			taulukko[i] = scanner.nextLine();
		}
		for(int j=0; j<taulukko.length; j++) {
			
			System.out.println(taulukko[j]);
			
		}
		
	}

}
