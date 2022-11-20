package basicjava;

public class Prime_Or_NotPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num = 5;
		int count = 0;
		for (int i = 2; i < Num; i++) {

			if (Num % i == 0) {

				count = count + 1;

			}

		}
		if (count > 0) {
			System.out.println("Not Prime Number");
		} else {
			System.out.println(" Prime Number");
		}

	}

}
