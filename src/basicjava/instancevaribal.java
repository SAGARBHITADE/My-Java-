package basicjava;

// instance variable in instance method.

//we can use instance variable diretly instance method.

public class instancevaribal {

	
	int car=50000;
	public void carprice() {
		System.out.println(car);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instancevaribal carout=new instancevaribal();
		carout.carprice();
		}

}
