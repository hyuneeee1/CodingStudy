import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int total = sc.nextInt(); 
		int N = sc.nextInt(); 
		
		for(int i=1; i<=N; i++) {
			
			int price = sc.nextInt();
			int num = sc.nextInt();
			
			sum += price * num ;
		}

			if(sum == total) {
				System.out.println("Yes");
			}else
				System.out.println("No");
		
	}

}
