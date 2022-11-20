package basicjava;
//import java.util.Scanner;

public class SwitchCaseCrickt {
	String a;
	public String Crickt(String Macth) {
		switch(Macth) {
		case "CSK":a="First Macth Date Is 06-05-2022";
				break;
		case "RCB":a="First Macth Date Is 07-05-2022";
		break;
		}
		return a;
	}
	

	public static void main(String[] args) {
		
		SwitchCaseCrickt sk=new SwitchCaseCrickt();
		System.out.println(sk.Crickt("RCB"));
	}

}
