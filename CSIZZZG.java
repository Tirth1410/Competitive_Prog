import java.util.Scanner;
public class CSIZZZG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        if(n % 2 != 0){
            for (int i = n-1; i >= 1; i-=2) {
                System.out.print(s.charAt(i-1));
            }

            System.out.print(s.charAt(0));

            for (int i = 3; i <= n; i+=2) {
                System.out.print(s.charAt(i-1));
            }
        } else {
            for (int i = n-1; i >= 1; i-=2) {
                System.out.print(s.charAt(i-1));
            }
            for (int i = 2; i <= n; i+=2) {
                System.out.print(s.charAt(i-1));
            }
        }
    }
}