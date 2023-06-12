import java.util.Scanner;
public class Divisibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(a < b) {
                System.out.println(b - a);
            } else {
                if(a % b != 0) {
                    System.out.println((((a / b) + 1) * b) - (a));
                } else {
                    System.out.println("0");
                }
            }
        }
    }
}