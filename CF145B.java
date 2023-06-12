import java.util.Scanner;
public class CF145B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = Long.parseUnsignedLong(sc.next());
            long s=1, e=n;
            long ans=0;

            if(n == 1){
                System.out.println("0");
                continue;
            }
            if(n <= 4){
                System.out.println("1");
                continue;
            }
            while (s <= e){
                long mid = s + (e-s)/2;
                if(mid >= Math.sqrt(n-mid)){
                    ans = mid;
                    e = mid-1;
                } else {
                    s = mid+1;
                }
            }
            System.out.println(ans);
        }
    }
}