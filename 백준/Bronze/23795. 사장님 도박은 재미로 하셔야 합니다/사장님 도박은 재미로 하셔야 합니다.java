import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	 int sum = 0; 
	
	 while(true) {
		
		int b = sc.nextInt();
			if(b == -1) {
				break;
			}
			
			sum += b;
		
	  }
		System.out.println(sum);
		
	} 
}