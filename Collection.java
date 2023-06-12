import java.util.Scanner;
public class Collection{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();

        while(t-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int max = Math.max(A, Math.max(B, C));

            int n = sc.nextInt();

            n -= (3 * max) - A - B - C;

            if(n < 0){
                System.out.println("NO");
            } else {
                if(n %  3 == 0){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}