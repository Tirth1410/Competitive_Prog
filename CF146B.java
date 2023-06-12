import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
public class CF146B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long min = Math.min(a, b);
            long max = Math.max(a, b);
            long m = 1;
            long steps = 0;
            long g1 = 1;
            while (min > 0) {
                if (min > 0) {
                    BigInteger gcd = BigInteger.valueOf(min).gcd(BigInteger.valueOf(max));
                    long g = gcd.longValue();

                    if (g == 1) {
                        min--;
                        steps++;
                    } else {
                        steps += (min / g);
                        steps += g - m;
                        m = g;
                        min = 0;
                        g1 = g;
                    }
                }
//            else {
//                steps += Math.min(max/g1, (max/2)-g1+2);
//            }
            }

            System.out.println(steps + Math.min(max / g1,m - (max % m) - g1 + 2));

        }
    }
}