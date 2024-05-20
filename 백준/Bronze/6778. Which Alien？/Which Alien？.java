import java.util.Scanner;

public class Main {
    
    public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A >= 3 && B <= 4) {
			System.out.println("TroyMartian");
		}if(A <=6 && B >=2) {
			System.out.println("VladSaturnian");
		} if (A <=2 && B <=3) {
			System.out.println("GraemeMercurian");
		}
	} 
}