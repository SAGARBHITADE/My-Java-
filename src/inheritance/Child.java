package inheritance;

public class Child extends Parents {
	
	public void Bussiness() {
		System.out.println("Transport Bussness");
		
	}
	public void Company() {
		System.out.println("product making box");
		
	}

	public static void main(String[] args) {
		
		Child rr=new Child();
		rr.Land();
		rr.Company();
		rr.Bussiness();
		rr.Gold();
//		Parents ref1=new Parents();
//		ref1.Land();
		// TODO Auto-generated method stub

	}

}
