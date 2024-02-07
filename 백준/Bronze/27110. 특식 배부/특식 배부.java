import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] chicken = new int[3];
        
        for (int i = 0; i < 3; i++) {
            chicken[i] = scanner.nextInt();
        }
        
        int result = 0;
        for (int i = 0; i < 3; i++) {
            if (chicken[i] <= N) {
                result += chicken[i];
            } else {
                result += N;
            }
        }
        
        System.out.println(result);
    }
}