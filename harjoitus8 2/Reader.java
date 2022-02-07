
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

	public static void main(String[] args) {
		System.out.println("Syötä tiedoston polku: ");
		Scanner sc = new Scanner(System.in);
		String tiedosto = sc.nextLine();
		ArrayList<Employee> employees = new ArrayList<>();
	
	    try(Scanner input = new Scanner(new FileInputStream(tiedosto))) {

	    	while(input.hasNext()){
	    		String line = input.nextLine();
	    		if(line.contains("HE")) {
	    			//call HourlyEmployee constructor and add new employee to ArrayList
	    			employees.add(new HourlyEmployee(input.nextLine(), input.nextDouble(), input.nextDouble()));
	    		}
	    		else if(line.contains("SE")) {
	    			//call HourlyEmployee constructor and add new employee to ArrayList
	    			employees.add(new SalesEmployee(input.nextLine(), input.nextDouble(), input.nextDouble()));
	    			
	    		}
	    		else if(line.contains("SM")) {
	    			//call HourlyEmployee constructor and add new employee to ArrayList
	    			employees.add(new SalesManager(input.nextLine(), input.nextDouble(), input.nextDouble(), input.nextDouble()));
	    		}
	    		input.nextLine();
	    		
	    	}
	       

	    } 
	    catch(IOException ex){
	       //TODO
	    }
	    
	    for(Employee e: employees) {
	    	System.out.println(e.toString()+", palkka: "+e.calculateSalary());
	    }

	}

}
