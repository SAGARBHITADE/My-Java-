package basicjava;

import java.util.Scanner;

public class V4 {
	public String url;
	public String	getEnv(String env) {
		
		switch(env) {
		
		case "DEV" :url= "www.dev-xyz.com";
	break;
		
		case "TEST" :url= "www.test-xyz.com";
		break;
	
		}
		
		return url;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter the No");
		
		int day=1;
		
		//String month=sc.next();
	
		switch (day) {
		
		case 1 : System.out.println("Monday");
		break;
		
		case 2 : System.out.println("Tuesday");
		break;
		
		case 3 : System.out.println("Wendesday");
		break;
		
		case 4 : System.out.println("Thursday");
		break;
		
		case 5 : System.out.println("Friday");
		break;
		
		case 6 : System.out.println("Saturday");
		break;
		
		case 7 : System.out.println("Sunday");
		break;
		
		default : System.out.println("Invalid input");
		
		}
		
		//Dev --->Test--> UAT-->Prod
		
	V4 ref=new V4();
		
		System.out.println(ref.getEnv("DEV"));
	
	}

}
