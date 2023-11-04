import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		
			int a = sc.nextInt();
			
			for(int i = 0;  i < a; i++) {
				
				String[] str = sc.next().split(",");
				
				int x,y;
				
				x = Integer.parseInt(str[0]);
				y = Integer.parseInt(str[1]);
				
				System.out.println(x+y);
			}

			}
}