import java.util.Arrays;
import java.util.Scanner;
public class NegAndPos{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int [n];

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            Arrays.sort(arr);
            for(int i=0; i<n-1; i++) {

            }

            System.out.println(sum + arr[0]);
        }
    }
}