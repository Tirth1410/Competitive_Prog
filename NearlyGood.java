import java.util.Scanner;
public class NearlyGood{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A % B == 0){
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(A*B + " " + A + " " +  ((A*B) + A));
            }
        }
    }
}