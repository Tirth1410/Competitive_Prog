import java.util.*;
public class CFGlobal16A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long s = Long.parseUnsignedLong(sc.next());

            long start=1, end=s;
            long ans = 0;
            long half1 = n/2,half2 = n/2;
            if(n % 2 == 0){
                half1--;
            }
            while (start <= end){
                long mid = start + ((end - start) / 2);

                if(s - mid >= half2 * mid){
                    ans = mid;
                    start = mid+1;
                } else {
                    end = mid - 1;
                }
            }

            System.out.println(ans);
        }
    }
}