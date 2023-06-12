import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Monstereasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] h = new int[n];
//            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
            }

            Arrays.sort(h);
            KillMon(h);
        }
    }

    public static void KillMon(int [] arr) {
        int px = 0;
        int c = arr[0]-1;
        int req = 2;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == req && arr[i] != arr[i-1]){
                req++;
                continue;
            } else {
                if(arr[i] > req) {
                    c += arr[i] - req;
                    arr[i] = req;

                    req++;
                }
            }
        }
        System.out.println(c);
    }
}