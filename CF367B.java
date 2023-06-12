import java.util.Arrays;
import java.util.Scanner;
public  class CF367B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] cost = new int [n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }
        Arrays.sort(cost);
        int days = sc.nextInt();
        while (days-- > 0){
            int limit = sc.nextInt();

            int s=0, e=n-1;
            int ans=0;
            while (s <= e){
                int mid = s + (e - s)/2;
                if(cost[mid] <= limit){
                    ans = mid+1;
                    s = mid+1;
                } else {
                    e = mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}