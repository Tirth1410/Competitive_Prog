import java.util.Arrays;
import java.util.Scanner;
public class CF746A{
    public static long SumArr(long [] arr, int s, int e){
        long sum=0;
        for (int i = s; i <= e; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long h = sc.nextLong();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

                long dam = arr[n - 1] + arr[n - 2];

                if (h % dam == 0) {
                    System.out.println(2 * (h / dam));
                } else {
                    if(h % dam <= arr[n-1]) {
                        System.out.println((2 * (h / dam)) + 1);
                    } else {
                        System.out.println((2 * (h / dam)) + 2);
                    }
                }
        }
    }
}