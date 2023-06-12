import java.util.Scanner;
public class CF146A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            long n = Long.parseUnsignedLong(s1);
            long k = Long.parseUnsignedLong(s2);

            if ((n - k) % 2 == 0) {
                System.out.println("YES");
            } else if(n % 2 == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}