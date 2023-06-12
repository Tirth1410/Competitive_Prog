import java.util.Scanner;
public class CSIZZZK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            if(n % 2 == 0){

                for (int i = 1; i <= n; i++) {
                    if(i% 2 == 0){
                        System.out.print("-2");
                        if(i == n){
                            continue;
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print("2 ");
                    }
                }
                System.out.println();
            } else {
                for (int i = 1; i <= n; i++) {
                    if(i % 2 == 0){
                        System.out.print((-1)*(n/2) + " ");
                    } else {
                        System.out.print((n/2 - 1));
                        if(i == n){
                            continue;
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}