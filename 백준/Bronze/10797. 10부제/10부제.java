import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			if(sc.nextInt() == A) {
				count++;
			}
		}
		
		System.out.println(count);
			
	}	
}
