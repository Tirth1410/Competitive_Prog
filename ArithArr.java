import java.util.Scanner;
public class ArithArr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int a;
            float sum=0;
            for(int i=1; i<=n; i++) {
                a = sc.nextInt();
                sum += a;
            }

            if(((sum / n))== 1) {
                System.out.println("0");
            } else {
                if((n+1) - sum < 0) {

                    System.out.println(((-1) * ((n+1) - (int)sum)) + 1);
                } else {
                    System.out.println("1");
                }
            }
        }
    }
}