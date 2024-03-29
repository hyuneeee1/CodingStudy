import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	  public static void main(String[] args) throws NumberFormatException, IOException {
		  
		  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		  
		  StringTokenizer st = new StringTokenizer(bf.readLine());
		  
		  int sum = 0;
		  
		  for ( int i = 0 ; i < 6;  i++) {
			  sum += Integer.parseInt(st.nextToken());
		  }
		  
		  System.out.println(sum * 5);
	  }
}