import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
    
public static void main(String[] args) throws IOException {
			
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 
			 int S = Integer.parseInt(st.nextToken());
			 int K = Integer.parseInt(st.nextToken());
			 int H = Integer.parseInt(st.nextToken());
			 
			 if((S+K+H) >= 100) {
				 System.out.println("OK");
			 }else if(S < K && S < H) {
				 System.out.println("Soongsil");
			 }else if(K < S && K < H) {
				 System.out.println("Korea");
			 }else if(H < K && H < S) {
				 System.out.println("Hanyang");
			 }
		
       }
    
}
