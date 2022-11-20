package basicjava;

//We can return output from instance method.

public class instancemethod {

	
	public int methodReturan(int t,int y) {
		int sum=t+y;
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		instancemethod returnoutput =new instancemethod();
		System.out.println(returnoutput.methodReturan(10, 20));
		
	}

}
