import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException  {

		Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			String b = sc.next();
			
			int count2 = 0;
			int counte = 0;
			
			char[] arr = new char[a];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = b.charAt(i);
				
				if(arr[i] == '2' ) {
					count2 += 1;
				}else {
					counte += 1;
				}
			}
			
			if(count2 == counte) {
				System.out.println("yee");
			}else if (counte > count2 ) {
				System.out.println("e");
			}else {
				System.out.println("2");
			}
			
		 
		}
	}
