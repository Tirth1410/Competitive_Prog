import java.util.Scanner;
public class ReviewSite{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int up = 0;
            while(n-- > 0) {
                int a = sc.nextInt();
                if(a == 1 || a == 3) {
                    up++;
                }
            }
            System.out.println(up);
        }
    }
}