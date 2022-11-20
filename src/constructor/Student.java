package constructor;

public class Student {
	public Student() {
		this("hi");
		System.out.println("My Name Is ");
	}

	public Student(String x) {
		this(10);
		System.out.println("Sagar");

	}

	public Student(int y) {
		System.out.println("Roll No Is 7");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
	}
}
