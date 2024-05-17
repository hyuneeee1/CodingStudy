import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();   //입력받는 횟수
		
		for(int i = 0; i < N; i++) {
			
			int a = sc.nextInt(); //횟수와
			String b = sc.next(); //기호 입력받기
			
			for(int j = 0; j < a; j++) {
				
				System.out.print(b);
			}
            System.out.println();
		}
	} 
}