package basicjava;

public class Swatch_Case_Return1 {
	String a;

	public String Month1(String Month2) {

		switch (Month2) {
		case "May":
			a = "10 Day Off";
			break;
		case "Jun":
			a = "15 Day Off";
			break;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Swatch_Case_Return1 mo = new Swatch_Case_Return1();
		System.out.println(mo.Month1("Jun"));

	}

}
