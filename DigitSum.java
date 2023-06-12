import java.util.Scanner;
public class DigitSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            if(n == 9){
                System.out.println("1");
            } else {
                if(n % 10 == 9){
                    System.out.println((n/10) + 1);
                } else {
                    System.out.println(n / 10);
                }
            }
        }
    }
}