import java.util.Scanner;

public class IdealPt{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();;

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int [] l = new int [n];
            int [] r = new int [n];

            int count = 0;
            for(int i=0; i<n; i++) {
                l[i] = sc.nextInt();
                r[i] = sc.nextInt();

                if(l[i] == k) {
                    count++;
                }
                if(r[i] == k) {
                    count++;
                }
            }
            if(count > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}