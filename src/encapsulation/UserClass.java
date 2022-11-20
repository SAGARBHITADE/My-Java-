package encapsulation;

public class UserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterClass i = new InterClass();

		i.getData(12345);
		
		i.setData(10);
		i.getData(12345);
	}

}
