import java.util.Scanner;
public class CF103A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            if(k < n){
                long temp = n-k;
                long rem = temp/k;
                if(temp % k != 0){
                    rem++;
                }
                System.out.println((long)Math.ceil((double) ((rem+1) * k) / n));
            } else {
//                System.out.println((double)1000000000/999999999);
//                System.out.println((float)k/n);
                System.out.println((long)Math.ceil((double) k/n));
            }
        }
    }
}