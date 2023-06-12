import java.util.Scanner;

public class PolycarpCoins{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();

            int c1 = 0;
            int c2 = 0;

            c1 += n / 3;
            c2 += n / 3;

            if(n % 3 == 2){
                c2++;
            }
            if(n % 3 == 1){
                c1++;
            }
            System.out.println(c1 + " " + c2);
        }
    }
}