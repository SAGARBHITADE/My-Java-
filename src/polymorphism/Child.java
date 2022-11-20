package polymorphism;

public class Child extends Parent {

	public void marry() {
		System.out.println("ram");
	}

	public static void main(String[] args) {
		Parent o = new Parent();
		o.marry();
		Child c = new Child();
		c.marry();
		c.Marry2();
		
		
		Parent h=new Child();
		h.marry();

	}

}
