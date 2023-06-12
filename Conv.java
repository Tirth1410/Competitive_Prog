import java.util.Scanner;
public class Conv{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            long x1 = sc.nextLong();
            long y1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y2 = sc.nextLong();

            long X1D = Math.min(x1-1, n-x1);
            long Y1D = Math.min(y1-1, n-y1);

            long X2D = Math.min(x2-1, n-x2);
            long Y2D = Math.min(y2-1, n-y2);

            long F1 = Math.min(X1D, Y1D);
            long F2 = Math.min(X2D, Y2D);

            System.out.println(Math.abs(F1-F2));
        }
    }
}