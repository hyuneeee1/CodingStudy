import java.util.*;

public class Main {
	
	  public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        
	        String a = sc.next();
	        
	        for(int i = 0; i < a.length(); i++) {
	        	char c = a.charAt(i);
	        	if(Character.isLowerCase(c)) {
	        		c = Character.toUpperCase(c);
	        	}else if (Character.isUpperCase(c)) {
	        		c = Character.toLowerCase(c);
	        				
	        	}
	        	System.out.print(c);
	        }
	  }
}