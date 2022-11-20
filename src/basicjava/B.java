package basicjava;

public class  B extends A {
	public static void m2() {
		System.out.println("Class Second");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A ss=new A();
//		ss.m1();
//		B aa=new B();
//		aa.m1();
		B.m1();
		B.m2();
	}
}
