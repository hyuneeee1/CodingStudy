import java.util.Scanner;
public class Main {	  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;

        for(int i = 1; i <=5; i++) {

            int A = sc.nextInt();

            result += Math.pow(A, 2);
        }

        System.out.println(result % 10);
	}
}