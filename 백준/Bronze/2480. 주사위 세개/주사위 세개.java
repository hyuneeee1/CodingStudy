import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(st.nextToken());
		
		if(num1 == num2 && num2 == num3 && num1 == num3) {
			
			System.out.println(10000 + (num1 * 1000)); 
					
		}else if (num1 == num2) {
			
			System.out.println(1000 + (num1 * 100)); 
			
		}else if (num1 == num3) {
			
			System.out.println(1000 + (num1 * 100)); 
			
		}else if (num2 == num3) {
			
			System.out.println(1000 + (num2 * 100)); 
		}
			
		if (num1 != num2 && num2 != num3 && num1 !=num3) {
			
			System.out.println(Math.max(num1, Math.max(num2, num3)) * 100); 
			
		}
		
	}
}