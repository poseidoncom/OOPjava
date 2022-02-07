import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchString {

	public static void main(String[] args) {
		System.out.println("Etsi tiedostosta merkkijonoa. Syötä tiedoston polku: ");
		Scanner sc = new Scanner(System.in);
		String tiedosto = sc.nextLine();
		System.out.println("Syötä hakusana jolla tiedostoa etsitään");
		String hakusana = sc.nextLine();
		
	
	    try(BufferedReader input = new BufferedReader(new FileReader(tiedosto))) {
				
	        String line;     
	        while((line = input.readLine()) != null) {
	            if(line.contains(hakusana)) {
	            	System.out.println(line);
	            }
	        }

	    } 
	    catch(IOException ex){
	       //TODO
	    }
		

	}

}
