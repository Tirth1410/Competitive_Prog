import java.util.Arrays;
import java.util.Scanner;
public  class CF640C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if (k < n) {
                System.out.println(k);
            } else {
                long s = 1, e = n * k;

                while (s <= e) {
                    long mid = s + (e - s) / 2;

                    long a = mid / n;
                    long r1 = a*n + (1 - a);
                    long r2 = a*n + (n-1 - a);
                    if (k >= r1 && k <= r2) {
                        long rem = k + a - (a*n);
                        System.out.println((a*n) + rem);
                        break;
                    }

                    if (k < r1) {
                        e = mid - 1;
                    } else if (k > r2) {
                        s = mid + 1;
                    }
                }
            }
        }
    }
}