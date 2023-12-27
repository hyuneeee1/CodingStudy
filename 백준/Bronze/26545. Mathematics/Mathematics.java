import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int sum = 0;
		
		
		for(int i = 0; i < t; i++) {
            
			int num = sc.nextInt();
			sum += num;
		}
		
		System.out.println(sum);
	}
   }