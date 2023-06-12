import java.util.Scanner;
public class CF574B{
    public static long sum(long mid){
        return (mid*(mid+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long s=1, e=n;
        while (s <= e){
            long mid = s + (e-s)/2;
            if(sum(mid) - n + mid == k){
                System.out.println(n - mid);
                break;
            } else if(sum(mid) - n + mid < k){
                s = mid+1;
            } else {
                e = mid-1;
            }
        }
    }
}