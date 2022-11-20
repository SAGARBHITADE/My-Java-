package basicjava;

public class Method {
		
	
	public static int add(int x, int y) {
		 
		  
		  int bharti=x+y; // 53=13+40
		   
		  return bharti;
		  		//53
		  
	  }
	
	public static int sub(int p,int b) {
		int pallavi=p-b;
		return pallavi;
		
	}
	public static int mul(int s,int n) {
		int sagar=s*n;
		return sagar;
	}
  public static void main(String[] args) {
		
		//Calling of static method by name
		System.out.println(add(13,40));//m(53);
		System.out.println(sub(30,40));//m(53);
		System.out.println(mul(2,2));//m(53);
				
	}
	
}



