package StringProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindSameCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		String name="sfttjttvttltt";
		String pat="tt";
		int count =0;
		
Pattern p =Pattern.compile(pat);
 Matcher m=p.matcher(name);
while(m.find()) {
	count++;
	System.out.println("pattren is available at : " + m.start()+ "Index");
	
}
System.out.println("Pattern ee found = " + count);
	}

}
