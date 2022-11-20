package encapsulation;

public class InterClass extends Account {

	public void getData(int accNo) {
		
		if (accNo == 12345) {

			System.out.println(super.getBalance(0));
		} else {

			System.out.println("Please eneter valid acc no");
		}
	}
	
public void setData(double  amount) {
		
		super.setBalance(amount);
			
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
