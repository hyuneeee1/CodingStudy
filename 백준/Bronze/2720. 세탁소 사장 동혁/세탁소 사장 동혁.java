import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		for(int i = 0; i < a; i++) {
			
			int b = sc.nextInt();
			
			System.out.print(b / quarter + " ");
			
			b = b % quarter;
			System.out.print(b / dime + " ");
			
			b = b % dime;
			System.out.print(b / nickel + " ");
			
			b = b % nickel;
			System.out.print(b / penny + " ");
		}
	}

}
