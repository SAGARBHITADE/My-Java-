package basicjava;

public class WhileUsing_LengthOfNo {

	public static void main(String[] args) {
		
		int x=123;
		int count=0;
		while(x!=0) {
			x=x/10; //123/10=12.3,12/10=1.2
			count=count+1;
			
			
		}
		System.out.println(count);

	}

}
