import java.util.Scanner;
public class ElaFit{
    public static long FindSport(long l, long r){
        if(l > r){
            return 0;
        }
        long mid = l + (r-l)/2;
        long left=0, right=0;
        if (mid % Math.floor(Math.sqrt(mid)) == 0){

            left +=  FindSport(l, mid-(long) Math.floor(Math.sqrt(mid)-1));
            right += FindSport(mid+(long) Math.floor(Math.sqrt(mid)-1), r);
            return 1 + left + right;
        }

        left +=  FindSport(l, mid-1);
        right += FindSport(mid+1, r);
        return left + right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long l = sc.nextLong();
            long r = sc.nextLong();

            long ans = FindSport(l, r);
            System.out.println(ans);
        }
    }
}