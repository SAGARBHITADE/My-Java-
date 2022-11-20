package AbstractProgram;

public class boy1 extends Father {

	boy1() {
		super(10);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	void Property() {
		// TODO Auto-generated method stub
		System.out.println("He want plot");
		System.out.println("Super x is " + super.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boy1 rr = new boy1();
		rr.Property();
	}
		
	}
	


