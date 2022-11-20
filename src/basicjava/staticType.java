package basicjava;

public class staticType {

	static int u=12;
	static String k;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can diretly access the static variables without creation of object.
		System.out.println(staticType.u);
		
		//If there is no inialization then in runtime jvm will provide default values.
		System.out.println(staticType.k);
	   //Value of static variables will be share with class members, if we change the value of variables
		// then latest updated values will be share with class members.
		
		u=15;
		
		System.out.println(u);
		

	}

}
