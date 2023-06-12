import java.math.BigInteger;
import java.util.Scanner;
public class CF860C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
//        BigInteger x = sc.nextBigInteger();
            long[] c = new long[n];
            int count = 0;
            int co=0, uc=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                b[i] = sc.nextLong();
                c[i] = a[i] * b[i];

                if(c[i] % n == 0){
                    if(co == 1){
                        continue;
                    } else {
                        count++;
                        co++;
                        uc = 0;
                    }
                } else {
                    if(uc == 1){
                        continue;
                    } else {
                        count++;
                        uc++;
                        co = 0;
                    }
                }
            }
            System.out.println(count);
        }
    }
}