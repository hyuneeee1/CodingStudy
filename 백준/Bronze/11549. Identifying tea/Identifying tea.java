import java.util.*;

public class Main {
public static void main(String[] args) {
			 
			 Scanner sc = new Scanner(System.in);
			 
			 int T     = sc.nextInt();
			 int[] arr = new int[5];
			 
			 for(int i = 0 ; i < arr.length; i++) {
				 	arr[i] = sc.nextInt();
			 }
			 
			 int answer = 0;
			 
			 for(int i = 0; i <arr.length; i++) {
				 if(arr[i] == T) {
					 answer++;
				 }
				 
			 }
                 System.out.println(answer);
		}
}