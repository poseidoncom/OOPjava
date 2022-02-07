import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ReaderWriter {
	ArrayList<Employee> tyontekijat= new ArrayList<>();
	private String fileName = "tyontekijat.dat";

	public static void main(String[] args) {
		
		ReaderWriter rw = new ReaderWriter();
		
		while(true) {
			Scanner main = new Scanner(System.in);
			System.out.println("1. Lisää työntekijöitä\n2. Tarkastele työntekijöitä");
			
			int i = main.nextInt();
			
			if(i==1) {
				rw.lisaaTyontekijaListaan();
				rw.kirjoitaTiedostoon();
			}
			
			else if(i==2) {
				rw.lueTiedostosta();
				rw.tulostaLista();
			}
		
			else {break;}
			
			
			
			
		}
		

	}
	
	public void lisaaTyontekijaListaan() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Syötä työntekijän tiedot.\nMikä työntekijä on kyseessä(SM, HE, SE): ");
		//sc.nextLine();
		String employeeType = sc.nextLine();
		
		
		if(employeeType.contains("HE")) {
			System.out.println("Työntekijän nimi: ");
			String employeeName = sc.nextLine();
			System.out.println("Tunnit: ");
			double hours = sc.nextDouble();
			System.out.println("Tuntipalkka: ");
			double hourlyWage = sc.nextDouble();
			tyontekijat.add(new HourlyEmployee(employeeName, hours, hourlyWage));
		}
		else if(employeeType.contains("SE")) {
			System.out.println("Työntekijän nimi: ");
			String employeeName = sc.nextLine();
			System.out.println("Myynnit:  ");
			double sales = sc.nextDouble();
			System.out.println("Komissioprosentti:  ");
			double comission = sc.nextDouble();
			tyontekijat.add(new HourlyEmployee(employeeName, sales, comission));
		}
		else if(employeeType.contains("SM")) {
			System.out.println("Työntekijän nimi: ");
			String employeeName = sc.nextLine();
			System.out.println("kk-palkka: ");
			double salary = sc.nextDouble();
			System.out.println("Myynnit: ");
			double sales = sc.nextDouble();
			System.out.println("Komissioprosentti: ");
			double percent = sc.nextDouble();
			tyontekijat.add(new SalesManager(employeeName, salary, sales, percent));
		}
	
	}
	
	public void kirjoitaTiedostoon() {
        System.out.println("ArrayList is serialized into tyontekijat.dat");
        try (ObjectOutputStream file_out
             = new ObjectOutputStream(new FileOutputStream(fileName))){
            file_out.writeObject(tyontekijat);
        }
        catch(Exception e) {
            System.out.println("Problems with " + fileName);
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void lueTiedostosta() {
        System.out.println("ArrayList is de-serialized from tyontekijat.dat");
        try (ObjectInputStream file_in 
            = new ObjectInputStream(new FileInputStream(fileName))){
            tyontekijat = (ArrayList<Employee>)file_in.readObject();
        }
        catch(Exception e) {
            System.out.println("Problems with " + fileName);
            e.printStackTrace();
        }
    }
    
    public void tulostaLista() {
    	System.out.println("Työntekijät: ");
    	for(Employee e: tyontekijat) {
	    	System.out.println(e.toString()+", palkka: "+e.calculateSalary());
	    }
    }
	
}
