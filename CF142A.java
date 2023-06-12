import java.util.Arrays;
import java.util.Scanner;
public class CF142A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int ans = 0;
            for (int i = 0; i < n-1; i++) {
                if(arr[i] == 1){
                    ans++;
                    arr[i] -= 1;
                    arr[i+1] -= 1;
                } else if(arr[i] > 0){
                    arr[i] = 0;
                    ans++;
                }
            }

            if(arr[n-1] == 0){
                System.out.println(ans);
            } else {
                System.out.println(ans+1);
            }
        }
    }
}