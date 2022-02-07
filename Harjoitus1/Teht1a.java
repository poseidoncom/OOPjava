import java.util.Scanner;
public class Teht1a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Syötä kokonaisluku: ");
		int luku1 = sc.nextInt();
		System.out.println("Syötä toinen kokonaisluku: ");
		int luku2 = sc.nextInt();
		sc.close();
		if(luku1<luku2) {
			System.out.println(luku1);
			System.out.println(luku2);
		}
		else {
			System.out.println(luku2);
			System.out.println(luku1);
		}

	}

}
