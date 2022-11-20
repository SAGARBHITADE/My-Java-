package constructor;

public class B1 {

	A2 ss2;

	public B1() {

		ss2 = new A2();
		System.out.println("My name Is ");

	}

	public B1(String x) {

		System.out.println("My name Is------ ");
		ss2.M1();

	}

	public void m1() {

		System.out.println("Balaji");

		ss2.M1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 bb = new B1("ram");
//		A2 aa=new A2();
//		aa.sagar();
//		aa.M1();

//		bb.m1();
	}

}
