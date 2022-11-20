package StringProgram;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="Velocity";
		//int a=name.length();
		
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
	}
		System.out.println(rev);
	}

}
