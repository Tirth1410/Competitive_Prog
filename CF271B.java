import java.util.Scanner;
public class CF271B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr [] = new long [n];
        long sum = 0;
        long arr2 [] = new long [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
            arr2[i] = sum;
        }

        int t= sc.nextInt();
        while (t-- > 0){
            long k = sc.nextLong();
            int s=0, e=n-1;

            int ans = 0;
            while (s <= e){
                int mid = s + (e-s)/2;
                if(arr2[mid] >= k){
                    ans = mid+1;
                    e = mid-1;
                } else {
                    s = mid+1;
                }
            }
            System.out.println(ans);
        }
    }
}