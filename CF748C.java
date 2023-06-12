import java.util.Arrays;
import java.util.Scanner;
public class CF748C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >  0){
            long n = sc.nextLong();
            int k = sc.nextInt();
            long [] cord = new long [k];

            for (int i = 0; i < k; i++) {
                cord[i] = sc.nextLong();
            }
            Arrays.sort(cord);
            long sum=0;

            int ans=0;
            for (int i = k-1; i >= 0; i--) {
                if(sum < cord[i]){
                    ans++;
                    sum += n-cord[i];
                } else {
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}