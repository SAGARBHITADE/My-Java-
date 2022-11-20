package basicjava;

public class PracticeProgram {
	
		
	
	
	public static void main(String[] args) {
		
		int no=1234;
		int rev=0;
		
		while(no!=0) {
			
			int rim=no%10;
			rev=rev*10+rim;
		   no=no/10;
			
			
		}
		
			System.out.println("Revers No is   "+rev);
	}
}
