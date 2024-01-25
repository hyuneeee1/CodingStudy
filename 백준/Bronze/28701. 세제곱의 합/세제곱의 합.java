import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = n * (n + 1) / 2;
        int sumSqrd = sum * sum;

        int sumOfCubed = 0;
        for (int i = 1; i <= n; i++) {
            sumOfCubed += Math.pow(i, 3);
        }

        System.out.println(sum);
        System.out.println(sumSqrd);
        System.out.println(sumOfCubed);
    }
}