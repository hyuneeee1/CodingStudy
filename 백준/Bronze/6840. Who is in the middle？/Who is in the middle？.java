import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
       
		int a = sc.nextInt();	
		int b = sc.nextInt();	
		int c = sc.nextInt();	
		
        ArrayList<Integer> al = new ArrayList<>();
        
        /* arrayList에 데이터 삽입 */
        al.add(a); 
        al.add(b);
        al.add(c);
        
        /* arrayList 정렬 */
        Collections.sort(al);
        
        /* 인덱스에서 2번째 값 출력 */
        System.out.println(al.get(1)); 

	}
  }