import java.util.Scanner;

public class Main {

public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int Min = 0; 
			int Man = 0;
			
			for(int i=0; i < 4; i++) {
				
				Min += sc.nextInt();
				
			}
			
			for(int i = 0; i <4; i++) {
				
				Man += sc.nextInt();
				
			}
			
			if(Min == Man) {
				System.out.println(Min);
			}else {

				System.out.println(Math.max(Min, Man));
		
	}
		}
   }