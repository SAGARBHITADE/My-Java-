package basicjava;

public class WhileReverseNo {

	public static void main(String[] args) {

		int num = 1234;
		int revers = 0;//first step 4 
		while (num != 0) {
			int Reminder = num % 10;
			revers = revers * 10 + Reminder;
			num = num / 10;
		}
		System.out.println(revers);
	}
}
