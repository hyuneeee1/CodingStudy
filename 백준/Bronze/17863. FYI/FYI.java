import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	String num1 = sc.nextLine();
	String num2 = num1.substring(0,3);
	
	
	if(num2.equals("555")) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
	
		
	} 
}