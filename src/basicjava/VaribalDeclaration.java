package basicjava;

public class VaribalDeclaration {

	int x=10;
	
	public void t1() {
		int r = x;
		System.out.println(x);
		
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VaribalDeclaration dd=new  VaribalDeclaration();
		dd.t1();
	}

}
