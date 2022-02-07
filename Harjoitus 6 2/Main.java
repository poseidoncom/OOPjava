import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Measurable> objektit = new ArrayList<Measurable>();
		
		objektit.add(new Suorakulmio(1,1));
		objektit.add(new Ympyra(1));
		
		for(Measurable me: objektit){
            System.out.println("Pinta-ala: "+me.area()+", piiri:" +me.perimeter());
		}
        
        System.out.println("Syötä kerroin jolla objekteja skaalataan: ");
        Scanner sc = new Scanner(System.in);
        double kerroin = sc.nextDouble();
        
        for(Measurable me: objektit){
            me.scale(kerroin);
        
        }
        
        for(Measurable me: objektit){
            System.out.println("Pinta-ala: "+me.area()+", piiri:" +me.perimeter());
		}
	}

}

