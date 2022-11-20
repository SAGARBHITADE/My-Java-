package encapsulation;

public class Account {
private double accountBalance=10.10;
	

	public double getBalance(int validAccNo) {
		
		return accountBalance;
	}
	
	
public void setBalance(double val) {
		
		this.accountBalance+=val;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
