import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();

        if(B>A){
            System.out.println("Bus");
        }
        else if(B<A){
            System.out.println("Subway");
        }else{
            System.out.println("Anything");
        }
    }
}