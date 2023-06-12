import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Nuclear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long min = Long.MAX_VALUE;
        long[] arr = new long[n];
        int c = 0;
        ArrayList<Long> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            if(arr[i] - arr[i+1] < min && arr[i] - arr[i+1] >= 0) {
                min = arr[i] + ((-1) * arr[i+1]);
            }
            if(arr[i+1] - arr[i] < min && arr[i+1] - arr[i] >= 0){
                min = arr[i+1] + ((-1) * arr[i+1]);
            }
        }
        for(int i=0; i<n-1 ; i++) {
            for(int j = i+1; j<n; j++) {
                if (arr[i] - arr[j] < min || arr[j] - arr[i] <  min){
                    if(!list.contains(arr[i])) {
                        list.add(arr[i]);
                    }
                    if(!list.contains(arr[i+1])) {
                        list.add(arr[i+1]);
                    }
                }
            }
        }
        System.out.println(list);
    }
}
