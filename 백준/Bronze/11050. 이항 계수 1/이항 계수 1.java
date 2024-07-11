import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int fac = 1;
		int fac2 = 1;
		int fac3 = 1;
		
		for(int i = 1; i <= n; i++ ) { // n!
			
			fac = i * fac;
		}
		
		for(int i = 1; i <= n-k; i++ ) { // (n-k)!
			
			fac2 = i * fac2;
		}
		
		for(int i = 1; i <= k; i++ ) { // k!
			
			fac3 = i * fac3;
		}
		
		System.out.println(fac/fac2/fac3);
		
		
	}
	
	
}
