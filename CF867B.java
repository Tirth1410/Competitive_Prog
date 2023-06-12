import java.util.Arrays;
import java.util.Scanner;
public class CF867B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.println(Math.max((arr[0] * arr[1]), (arr[n - 1] * arr[n - 2])));
        }
    }
}