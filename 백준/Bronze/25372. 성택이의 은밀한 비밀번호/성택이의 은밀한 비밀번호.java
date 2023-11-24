import java.util.*;

public class Main {
public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				
				int N = sc.nextInt();
				
				for(int i = 0; i < N; i++) {
					
					String PW = sc.next();
					
					if(PW.length() >= 6 && PW.length() <= 9) {
						System.out.println("yes");
					} else {
						System.out.println("no");
					}
				}
			}
}