import java.util.Arrays;
import java.util.Scanner;
public class Dice{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int r = sc.nextInt();

            int [] seq = new int [n];
            for(int i=0; i<n; i++) {

                    if((r - ((r/(n-1))*(n-1))) < (((r/(n-1))+1)*(n-1)) - r) {
                        if(i == n-2) {
                            seq[i] = (r/(n-1)) + (r % (n-1));
                        } else if(i == n-1) {
                            seq[i] = s-r;
                        } else {
                            seq[i] = r/(n-1);
                        }
                    } else {
                        if(i == n-2) {
                            seq[i] = (r/(n-1));
                        } else if(i == n-1) {
                            seq[i] = s-r ;
                        } else {
                            seq[i] = (r/(n-1)) + 1;
                        }
                    }
            }

            for(int i=0; i<n; i++) {
                System.out.printf("%d ", seq[i]);
            }
        }
    }
}