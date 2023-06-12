import java.util.Arrays;
import java.util.Scanner;
public class CF145C {
    public static int[] FindArr(int k, int n, int[] arr, int idx) {
        if (k <= n) {
            for (int i = idx; i < n+idx; i++) {
                if (i < k - 1) {
                    arr[i] = -1;
                } else if (i == k - 1) {
                    arr[i] = k;
                } else {
                    arr[i] = (-1) * k;
                }
            }
            return arr;
        } else {
            arr[idx] = 1000;
            return FindArr(k - n, n - 1, arr, idx++);
        }
//        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println((-1) * (i + 1));
                }
            } else if (k == (n * (n + 1)) / 2) {
                for (int i = 0; i < n; i++) {
                    System.out.println(i + 1);
                }
            } else {
                int[] arr = new int[n];
//                    int idx = (int) Math.ceil((-1 + Math.sqrt(1 + (8 * k))) / 2);
                    int[] ans = FindArr(k, n, arr, 0);
                    System.out.println(Arrays.toString(ans));

            }
        }
    }
}