import java.util.*;
public class CF545A{
    public static boolean isSuitable(int [] arr, int mid){
        int clas = mid;
        int start = 0;

        while (start <= arr.length - (mid*2)){
            int sum1=0, sum2=0;
            for (int i = start; i <= start+(mid*2)-1; i++) {
                if(i-start < mid) {
                    sum1 += arr[i];
                } else {
                    sum2 += arr[i];
                }
            }

            if((sum1 / mid == 1 && sum2 / mid == 2) || (sum2 / mid == 1 && sum1 / mid == 2)){
                return true;
            }

            start++;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 2, e=n/2;
        int ans = 0;

        while (s <= e){
            int mid = (s + e)/2;
            if(isSuitable(arr,mid)){
                s = mid + 1;
                ans = mid;
            } else {
                e = mid-1;
            }
        }

        System.out.println(ans);
    }
}