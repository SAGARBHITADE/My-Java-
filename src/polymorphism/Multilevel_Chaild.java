package polymorphism;

public class Multilevel_Chaild extends Multilevel_Parent {
	
	public void land() {
		System.out.println(" 5 ekar Land");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multilevel_Chaild ref=new Multilevel_Chaild();
		ref.gold();
		ref.cash();
		ref.land();

	}

}
