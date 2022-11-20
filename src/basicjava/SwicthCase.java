package basicjava;
import java.util.Scanner;
public class SwicthCase {

	
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.println("Plz Enter Day Number");
		int day=ref.nextInt();
		switch(day) {
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
			
		}
		
	}

}

