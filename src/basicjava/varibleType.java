package basicjava;

public class varibleType {
	//Global Variable
		//declration & intalization
		int x=10;
		String t;

	public static void main(String[] args) {
		//To use or call instance variable we will require object of the class.
		varibleType global=new varibleType();
			System.out.println(global.x);
			
			//When there only declration of instance variable and if try to use this variables, then 
			//in run time jvm will provide default values for perticular data types.

			System.out.println(global.t);
		

	}

}
