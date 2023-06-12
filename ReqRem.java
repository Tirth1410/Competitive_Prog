import java.util.Scanner;
public class ReqRem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            if(n % x < y){
                n -= x;
                n += y - (n % x);
            } else {
                n -= (n % x) - y;
            }

            System.out.println(n);
        }
    }
}