import java.util.Arrays;
import java.util.Scanner;
public class CF783B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            long[] req = new long[n];

            for (int i = 0; i < n; i++) {
                req[i] = sc.nextLong();
            }
            if (n > m) {
                System.out.println("NO");
            } else {
                Arrays.sort(req);

                long ReqChairs = 0;
                for (int i = n-1; i >= 0; i--) {
                    if(i == n-1){
                        ReqChairs += (2 * req[i])+1;
                    } else if(i == 0){
                        ReqChairs += 1;
                    } else {
                        ReqChairs += req[i]+1;
                    }
                }

                if (ReqChairs > m){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}