//import javafx.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Incinerate {
    public static boolean KillThem(long [][] hp, int k, long min, int idx){
        if(hp[hp.length-1][0] <= 0){
            return true;
        }
        if(k <= 0){
            return false;
        }
        for (int i = idx; i < hp.length; i++) {
            hp[i][0] -= k;
            if (hp[i][0] > 0){
                if(hp[i][1] < min){
                    min = hp[i][1];
                }
            } else {
                idx = i+1;
            }
        }
        k -= min;
//        KillThem(hp, k, Integer.MAX_VALUE, idx);
        return false || KillThem(hp, k, Long.MAX_VALUE, idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long arr[][] = new long[n][2];
            for (int i = 0; i < 2 * n; i++) {
                if (i < n) {
                    arr[i][0] = sc.nextLong();
                } else {
                    arr[i - n][1] = sc.nextLong();
                }
            }
//        System.out.println(Arrays.deepToString(arr));
            Arrays.sort(arr, Comparator.comparingLong(a -> a[0]));

//        System.out.println(Arrays.deepToString(arr));
            Arrays.stream(arr).min(Comparator.comparingLong(a -> a[1]));
            boolean AllFinish = KillThem(arr, k, Long.MAX_VALUE, 0);
            if (AllFinish) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}