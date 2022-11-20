package basicjava;

public class Pattarn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		for (int row = 1; row <= 5; row++) {

			for (int col = 1; col <= row; col++) {

				x=x+1;
				System.out.print(x);
				System.out.print(" ");

			}

			System.out.println();
		}

	}
}
