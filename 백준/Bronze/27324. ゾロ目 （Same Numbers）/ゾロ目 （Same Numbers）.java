import java.util.*;

public class Main {	 
public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt();
	        
	      if(N % 11 == 0 ) {
	    	  System.out.println(1);
	      }else if(N % 11 != 0) {
	    	  System.out.println(0);
	      }
    }
}