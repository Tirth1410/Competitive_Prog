import java.util.Scanner;
import java.lang.Math;
public class PullLuck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int p = sc.nextInt();

            int req = n - x;
            boolean isPoss = false;

            int sum = x;
            int i = Math.min(n, p);
            for (int j=0; j<=i; j++){
                sum += j;
                if(sum % n == 0){
                    isPoss = true;
                    break;
                }
            }
            if(isPoss){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}