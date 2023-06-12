import java.util.Scanner;
public class Perfectsqrt{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++) {
            int x = sc.nextInt();

            if(((float)Math.sqrt(x) % 1) != 0) {
                if(x > max) {
                    max = x;
                }
            }
        }
        System.out.println(max);
    }
}