import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;	

public class Main {

public static void main(String[] args) throws IOException {
	
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 
			 int n = Integer.parseInt(br.readLine());
			 
			 System.out.println((int)(n * 0.78) + " " + (int)(n*0.8 + (n*0.2*0.78)));
		}
   }