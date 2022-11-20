package basicjava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import javax.lang.model.type.ArrayType;

public class Collection {

	public static void main(String[] args) {
		
//		int arr[]=new int[2];
//		arr[0]=10;
//		arr[1]=15;
//		
//		for(int d:arr) {
//			System.out.println(d);
//		}
//		
//		ArrayList ee=new ArrayList();
//		ee.add("sss");
//		ee.add(10);
//		System.out.println(ee);
	
//	String arrr[]= {"pune","Solapur","Dharashiv","SambhajiNagar"};
//	ArrayList<String> sl=new ArrayList<String>(Array.(arrr));
//	sl.add("pune");
//	sl.add("pune");
//	System.out.println(sl);
//	
//	System.out.println();	
		String arr[]= {"Pune", "Mumbai", "Nashik", "Nashik"};
		
		
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		
		al.add("Kolhapur");
		al.add("Solapur");
		System.out.println(al);
		
		//Iterator
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			
			String val=itr.next();
			
			System.out.println(val);

	}
		}

}
