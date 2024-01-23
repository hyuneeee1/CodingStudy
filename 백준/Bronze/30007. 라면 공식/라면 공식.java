import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 예찬이가 라면을 끓이는 횟수 N을 입력 받음
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        // 각 라면 끓이기에 필요한 정보를 저장할 배열들
        int[] A = new int[N];
        int[] B = new int[N];
        int[] X = new int[N];

        // 라면 끓이기 정보 입력
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            A[i] = Integer.parseInt(input[0]);
            B[i] = Integer.parseInt(input[1]);
            X[i] = Integer.parseInt(input[2]);
        }

        // 각 라면 끓이기에 필요한 물의 양을 계산하여 출력
        for (int i = 0; i < N; i++) {
            int Wi = A[i] * (X[i] - 1) + B[i];
            System.out.println(Wi);
        }

    }
}