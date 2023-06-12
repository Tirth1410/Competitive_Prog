import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class CF854B{
    public static boolean isEq(long [][] arr, int n){
        if(arr[0][0] == arr[n-1][0]){
            return true;
        } else {
            return false;
        }
    }
    public static void Solve(long [][] arr, int n){
        ArrayList<long[]> list = new ArrayList<>();
        while (!isEq(arr, n)){
            long a = arr[n-1][0];
            long b = arr[0][0];
            long div = a / b;
            if (a % b != 0){
                div++;
            }

            arr[arr.length-1][0] = div;
            long [] idx = new long [2];
            idx[0] = arr[n-1][1];
            idx[1] = arr[0][1];

            list.add(idx);

            Arrays.sort(arr, Comparator.comparingLong(o -> o[0]));
//            System.out.println(Arrays.deepToString(arr));
        }

        System.out.println(list.size());
        if(list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i)[0] + " " + list.get(i)[1]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            long arr[][] = new long [n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = i+1;
            }

            Arrays.sort(arr, Comparator.comparingLong(ar -> ar[0]));
//            System.out.println(Arrays.deepToString(arr));
            if(arr[0][0] == 1 && !isEq(arr,n)){
                System.out.println("-1");
            } else {
                Solve(arr, n);
            }
        }
    }
}