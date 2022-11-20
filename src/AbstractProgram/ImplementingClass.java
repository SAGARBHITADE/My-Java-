package AbstractProgram;

public class ImplementingClass  extends A1{
	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("ImplementingClass ");
		System.out.println("Value of x  "+super.x);
	}
	
	public ImplementingClass() {
		
		super(10);
		System.out.println("ImplementingClass Counstroctor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementingClass ss=new ImplementingClass();
		ss.m1();
		
		
	}

}
