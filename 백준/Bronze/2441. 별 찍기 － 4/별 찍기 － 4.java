import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}for(int j = 0; j < a-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
