import java.util.Scanner;
public class Socks {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a <= b) {
            System.out.println(a);
            System.out.println((b-a)/2);
        } else {
            System.out.println(b);
            System.out.println((a-b)/2);
        }
    }
}