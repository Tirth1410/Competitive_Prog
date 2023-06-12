import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class CF148B{
    //NOT APPLICABLE DUE TO TIME LIMIT EXCEED
    public static long FindMaxSum(long [] arr, long sum, int k, int min1, int min2, int max){
        if(k <= 0){
            return sum;
        }
        long TakingMax = Long.MAX_VALUE ,TakingMin = Long.MAX_VALUE;
        if(min1 < arr.length-1 && min2 <= arr.length-1) {
            TakingMin = FindMaxSum(arr, sum - arr[min1] - arr[min2], k - 1, min1 + 2, min2 + 2, max);
        }
        if(max >= 0){
            TakingMax = FindMaxSum(arr, sum - arr[max], k - 1, min1, min2, max - 1);
        }
        return Math.max(TakingMin, TakingMax);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long [] arr = new long [n];
            long sum=0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n-k; i++) {
                sum += arr[i];
            }

            int s=0, e=n-k;
            long ans=sum;
            while (k-- > 0){
                sum += arr[e] - (arr[s] + arr[s+1]);
                e++;
                s += 2;

                ans = Math.max(ans, sum);
            }
//            Arrays.sort(arr);
//            long ans = FindMaxSum(arr, sum, k, 0, 1, arr.length-1);
//            System.out.println(ans);
            System.out.println(ans);
        }
    }
}