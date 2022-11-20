package basicjava;
import java.util.Scanner;
public class Nested_If_Else {

	public static void main(String[] args) {
		
		var nn=new Scanner(System.in);
		System.out.println("vaccin done plz enter true or false");
		boolean Vaccination=nn.nextBoolean();
		System.out.println("Plz Enter No Of Dose");
		int noOfDose=nn.nextInt();
		
  //		boolean Vaccination=true;
 //		int noOfDose=1;
	
		if(Vaccination) {
			if(noOfDose>=2) {
				System.out.println("you can wacth movei");
			}else {
				System.out.println("no entry wacth movei");
			}
		}
	}
}
