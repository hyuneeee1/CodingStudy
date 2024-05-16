import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        
        for (int i = 0; i < testCase; i++) {
            int problems = scanner.nextInt();
            for (int j = 0; j < problems; j++) {
                int[] numbers = new int[2];
                for (int k = 0; k < 2; k++) {
                    numbers[k] = scanner.nextInt();
                }
                System.out.println(numbers[0] + numbers[1] + " " + numbers[0] * numbers[1]);
            }
        }
        scanner.close();
    }
}