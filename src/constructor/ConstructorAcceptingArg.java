package constructor;

public class ConstructorAcceptingArg {

	int x;
	String y;

	public ConstructorAcceptingArg(int RollNo, String Name) {
		this.x = RollNo;
		this.y = Name;
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorAcceptingArg ref = new ConstructorAcceptingArg(07, "Sagar");

	}

}
