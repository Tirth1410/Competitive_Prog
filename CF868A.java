import java.util.ArrayList;
import java.util.Scanner;
public class CF868A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if(n==2 && k == 0){
                System.out.println("YES");
                System.out.println("1 -1");
                continue;
            }

            for (int i = 1; i<=n; i++){
                if(i == 1 || i == n){
                    if((n * (n-1))/2 == k){
                        System.out.println("YES");
                        for (int j = 0; j < n; j++) {
                            System.out.print("1 ");
                        }
                        System.out.println();
                        break;
                    } else {
                        if(i == n){
                            System.out.println("NO");
                            break;
                        }
                        continue;
                    }
                }
                int r1 = (i*(i-1))/2;
                int j = n-i;
                int r2 = (j*(j-1))/2;

                if(r1 + r2 == k){
                    System.out.println("YES");
                    for (int l = 1; l <= n; l++) {
                        if(l <= i) {
                            System.out.print("1 ");
                        } else {
                            System.out.print("-1 ");
                        }
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
}
