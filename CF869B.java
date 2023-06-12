import java.util.*;
public class CF869B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();

            if(n == 1){
                System.out.println(1);
                continue;
            }
            if(n % 2 != 0){
                System.out.println("-1");
            } else {
                int a = 1;
                int b = 2;

                for (int i = 1; i <= n; i++) {
                    if(i % 2  != 0){
                        System.out.print(b + " ");
                        b += 2;
                    } else {
                        System.out.print(a + " ");
                        a += 2;
                    }
                }

                System.out.println();
            }
        }
    }
}