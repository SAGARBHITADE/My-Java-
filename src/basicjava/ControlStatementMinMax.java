package basicjava;
import java.util.Scanner;
public class ControlStatementMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner rr=new Scanner(System.in);
   System.out.println("Plz Enter the First x No");
   int x=rr.nextInt();
   System.out.println("plz enter the second y no");
   int y=rr.nextInt();
   System.out.println("plz enter the third z No");
   int z=rr.nextInt();
  
   if(x>=y&& x>=z) {
	   System.out.println("x is max");
   }else if(y>=z){
	   System.out.println("y is Max");
   }else{
	   System.out.println("Z Is mAx");
   		}
	
	}

}
