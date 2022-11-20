package basicjava;

public class SwatchCaseReturn {
		
	public String Z;

	public String	getEnv(String env) {
		
		switch(env) {
		
		case "A" :Z= "SAGA";
	    break;
		
		case "B" :Z= "RAMA";
		break;
	
		}
		
		return Z;
	   
	}


	public static void main(String[] args) {
		
		SwatchCaseReturn ref=new SwatchCaseReturn();
		
		System.out.println(ref.getEnv("B"));
	}
}


