import java.io.*;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       StringTokenizer st = new StringTokenizer(br.readLine());
       
        int W = Integer.parseInt(st.nextToken()); 
        int H = Integer.parseInt(st.nextToken()); 
        
        System.out.println(Math.round(W * H) * 0.5);

    }
	
}