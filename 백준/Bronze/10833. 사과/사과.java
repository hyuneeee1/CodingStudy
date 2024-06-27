import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //학교 수
		int total = 0; //나머지 사과 수 초기화
		
		for(int i = 0; i < a; i++) {
            
            int student = sc.nextInt(); //학생 수
			int apple = sc.nextInt(); //사과 수
			
			
			total += apple % student;
		}
		
		System.out.println(total);
		
	}
}
