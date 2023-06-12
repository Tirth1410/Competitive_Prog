import java.util.Scanner;
public class CF750{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int timeneed = sc.nextInt();
        int time = 240 - timeneed;

        int s=1, e=n;

        int ans=0;
        while (s <= e){
            int mid = (s + e)/2;

            if(mid * (mid+1) * 5 <= 2 * time){
                ans = mid;
                s = mid+1;
            } else {
                e = mid-1;
            }
        }

        System.out.println(ans);
    }
}