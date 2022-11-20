package AbstractProgram;

public class ImplimentMarks extends Marks {

	public ImplimentMarks() {
		// TODO Auto-generated constructor stub
		super(15);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplimentMarks pp = new ImplimentMarks();
		pp.s1();
	}

	@Override
	void s1() {
		// TODO Auto-generated method stub
		System.out.println("Value of Marks " + super.d);
	}

}
