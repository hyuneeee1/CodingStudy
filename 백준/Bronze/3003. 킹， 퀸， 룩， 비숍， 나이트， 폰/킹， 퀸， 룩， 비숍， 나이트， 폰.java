import java.util.*;

public class Main {
public static void main(String[] args) {
				
				int king = 1;
				int queen = 1;
				int rook = 2;
				int bishop = 2;
				int knight = 2;
				int pawn = 8;
				
				Scanner sc = new Scanner(System.in);
				
				king = king - sc.nextInt();
				queen = queen - sc.nextInt();
				rook = rook - sc.nextInt();
				bishop = bishop - sc.nextInt();
				knight = knight - sc.nextInt();
				pawn = pawn - sc.nextInt();
				
				// 원래 개수에서 동혁이가 찾은 개수 빼기 -> 필요한 개수가 나옴
				System.out.print(king + " ");
				System.out.print(queen + " ");
				System.out.print(rook + " ");
				System.out.print(bishop + " ");
				System.out.print(knight + " ");
				System.out.print(pawn);
			}
    }