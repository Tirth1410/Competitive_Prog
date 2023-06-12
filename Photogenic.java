import java.util.Arrays;
import java.util.Scanner;
public class Photogenic{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int [n];
            int seq [] = new int [n];
            int s = 0, e = n-1;
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] % 2 != 0) {
                    seq[s] = arr[i];
                    s++;
                } else {
                    seq[e] = arr[i];
                    e--;
                }
            }
            for(int i=0; i<n; i++) {
                System.out.print(seq[i] + " ");
            }
        }
    }
}