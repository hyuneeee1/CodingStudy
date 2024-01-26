import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

		BigInteger N = new BigInteger(stk.nextToken());
		BigInteger M = new BigInteger(stk.nextToken());

		System.out.println(N.divide(M));
		System.out.println(N.remainder(M));
	}

}