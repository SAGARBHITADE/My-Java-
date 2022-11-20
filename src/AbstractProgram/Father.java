package AbstractProgram;

public abstract class Father {
	int x;
	Father(int a){
		this.x=a;
		System.out.println("abstract class constructor");
		System.out.println(x);
	}

	abstract void Property();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
