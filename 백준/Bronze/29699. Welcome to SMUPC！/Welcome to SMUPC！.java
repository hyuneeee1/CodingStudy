import java.util.*;

public class Main {  
    
public static void main(String[] args) {
		  
	   Scanner sc = new Scanner(System.in);
	   
	   String smupc = "WelcomeToSMUPC";
	   
	   int a = sc.nextInt();
	   
	   char result = smupc.charAt((a - 1) % 14 );
	   
	   System.out.println(result);

    
	  	}
   }