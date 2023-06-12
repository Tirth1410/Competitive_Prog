import java.util.Scanner;
public class CF118C {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long pos [] = new long [n];
            long gap [] = new long [n];
            for (int i = 0; i < n; i++) {
                pos[i] = sc.nextLong();
                if(i != 0){
                    gap[i-1] = pos[i] - pos[i-1] - 1;
                }
            }
            gap[n-1] = Long.MAX_VALUE;

            long s=1, e=k;
            long ans = 0;
            while (s <= e){
                long mid = s + (e-s)/2;
                long sum=n;
                for (int i = 0; i < n; i++) {
                    sum += Math.min(mid-1, gap[i]);
                    if(sum >= k){
                        ans = mid;
                        break;
                    }
                }
                if(sum >= k){
                    e = mid-1;
                } else {
                    s = mid+1;
                }
            }
            System.out.println(ans);
        }
    }
}