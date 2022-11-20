package polymorphism;

public class OverLoding {

	public void m1() {
		System.out.println("No argument In method");
	}

	public void m1(int a) {
		System.out.println("With int argument ");

	}

	public void m1(String s) {
		System.out.println("with string argument ");
	}

	public static void main(String[] args) {
		OverLoding ref = new OverLoding();
		ref.m1();
		ref.m1(0);
		ref.m1("Sagar");

	}

}
