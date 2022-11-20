package constructor;

public class A1 {

	int rollno;
	String name;
	String lname;
	A2 ss;

	public A1(int R_No, String Name) {
		this("LName");
		ss = new A2();
		this.rollno = R_No;
		this.name = Name;
		System.out.println(rollno);
		ss.sagar();

		System.out.println(name);
	}

	public A1(String LName) {
		this.lname = LName;
		// ss.sagar();

		System.out.println(lname);
	}

	public void ram() {
		// ss.sagar();
		ss.sagar();
		ss.M1();

	}

	public void ram1() {
		ss.M1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 aa = new A1(7, "sagar");
		A1 aaa = new A1("Bhitade");
		aa.ram();
		aa.ram1();

	}
}
