import java.util.Map;
import java.util.Scanner;
public class CF862A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
           int n = sc.nextInt();
           int [] a = new int [n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = -1;
            for (int i = 0; i < 256; i++) {
                int temp = 0;
                for (int j = 0; j < n; j++) {
                    temp ^= (i ^ a[j]);
                }
                if (temp == 0){
                    ans = i;
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}