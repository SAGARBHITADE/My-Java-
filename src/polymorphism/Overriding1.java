package polymorphism;

public class Overriding1 extends Overriding  {
	
	public void m1() {
		System.out.println("Nikita ");
	}

	public static void main(String[] args) {
		
		//Parent reference and object parent
		Overriding ra=new Overriding();
		ra.m1();
		//Child Reference & child Object
		Overriding1 ch=new Overriding1();
		ch.m1();
		//Parent reference & Child object --> Only possible when there is inheritance using extends keyword
		Overriding rr=new Overriding1();
		rr.m1();
		
	}

}
