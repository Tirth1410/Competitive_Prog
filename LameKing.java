import java.util.Scanner;
import java.lang.Math;

public class LameKing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = Math.max(Math.abs(a),Math.abs(b));

            if(Math.abs(a) != Math.abs(b)){
                System.out.println((2*max)-1);
            } else {
                System.out.println(2*max);
            }
        }
    }
}