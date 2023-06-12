import java.util.Scanner;
public class FavSeq{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int [] seq = new int [n];
            int [] out = new int [n];
            int s=0, e=n-1;

            for(int i=0; i<n; i++) {
                seq[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++) {
                if(i % 2 == 0) {
                    out[i] = seq[s];
                    s++;
                } else {
                    out[i] = seq[e];
                    e--;
                }
            }

            for(int i=0; i<n; i++) {
                System.out.printf("%d ", out[i]);
            }
        }
    }
}