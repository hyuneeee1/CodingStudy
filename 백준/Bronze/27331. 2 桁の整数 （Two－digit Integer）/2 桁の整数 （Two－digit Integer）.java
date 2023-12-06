import java.util.*;

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        int B = scanner.nextInt();

        if (A >= 1 && A <= 9 && B >= 0 && B <= 9) {
            int twoDigitNumber = A * 10 + B;
            System.out.println(twoDigitNumber);
        } else {
        }

    }
}