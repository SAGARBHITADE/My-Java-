package basicjava;

public class objectToobjectvalue {
	int y=15;

	public static void main(String[] args) {
		//object creation-1
		objectToobjectvalue obj=new objectToobjectvalue();
		System.out.println(obj.y);
		
		//vary from object to object of a class.
		objectToobjectvalue r=new objectToobjectvalue();
		r.y=45;
		System.out.println(r.y);
		r.y=7;
		System.out.println(r.y);
		
		
		
	}

}
