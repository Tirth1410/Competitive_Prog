import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
public class CF860A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] b = new int[n];
            int maxA = Integer.MIN_VALUE;
            int maxB = Integer.MIN_VALUE;
            for (int i = 0; i < 2*n; i++) {
                if(i < n){
                    a[i] = sc.nextInt();
                } else {
                    b[i-n] = sc.nextInt();
                    if(a[i-n] > b[i-n]){
                        int temp = a[i-n];
                        a[i-n] = b[i-n];
                        b[i-n] = temp;
                    }
                }
            }
            for (int i = 0; i < 2*n; i++) {
                if(i < n){
                    if(a[i] > maxA){
                        maxA = a[i];
                    }
                } else {
                    if(b[i-n] > maxB){
                        maxB = b[i-n];
                    }
                }
            }

            if(maxA == a[n-1] && maxB == b[n-1]){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}