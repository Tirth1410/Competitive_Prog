import java.util.Scanner;
public class BalancedArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            if((n/2) % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for(int i=0; i<n; i++) {
                    if(i < (n/2)) {
                        System.out.printf("%d ", (i+1)*2);
                    } else {
                        System.out.printf("%d ", (((i-(n/2))+1)*2)-1);
                    }
                }
            }
        }
    }
}
