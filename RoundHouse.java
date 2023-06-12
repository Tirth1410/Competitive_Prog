import java.util.Scanner;
public class RoundHouse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b < 0){
            if(Math.abs(b) >= a){
                b+=a;
                System.out.println(n+(b%n));
            } else {
                System.out.println(a+b);
            }
        } else  {
            if(b > n-a){
                b -= n-a;
                if(b%n == 0){
                    System.out.println(n);
                } else {
                    System.out.println(b % n);
                }
            } else {
                if(a + (b % n) == 0) {
                    System.out.println(n);
                } else {
                    System.out.println(a + (b % n));
                }
            }
        }
    }
}