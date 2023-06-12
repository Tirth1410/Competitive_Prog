import java.util.Scanner;
public class CF871D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            long n = sc.nextLong();
            long x = sc.nextLong();

            if(n == x){
                System.out.println("YES");
                continue;
            }

            if(n % 3 != 0){
                System.out.println("NO");
                continue;
            }

            if(n < x){
                System.out.println("NO");
                continue;
            }

            if(n % 2 == 0) {
                double temp = (x * 3) / 2;
                if(temp > n){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {

            }
        }
    }
}