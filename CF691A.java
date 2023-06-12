import java.util.Scanner;
public class CF691A {
    public static long GCD(long a, long b){
        if(b == 0){
            return a;
        }

        return GCD(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long [] a = new long [n];
        long [] b = new long [m];

        long defGCD = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(i >= 1){
                defGCD = GCD(defGCD, Math.abs(a[i] - a[0]));
            }
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextLong();
            System.out.print(GCD(a[0] + b[i], defGCD) + " ");
        }
    }
}