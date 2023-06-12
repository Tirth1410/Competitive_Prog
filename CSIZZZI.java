import java.util.*;
public class CSIZZZI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long x1 = sc.nextLong();
            long p1 = sc.nextLong();
            long x2 = sc.nextLong();
            long p2 = sc.nextLong();

            long min = Math.min(p1, p2);
            p1 -= min;
            p2 -= min;

            for (int i = 0; i < p1; i++) {
                x1 *= 10;
            }

            for (int i = 0; i < p2; i++) {
                x2 *= 10;
            }

            if(x1 > x2){
                System.out.println(">");
            } else if(x1 < x2){
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
    }
}