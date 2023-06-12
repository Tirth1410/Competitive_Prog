import java.util.Scanner;
public class CF498C {
    public  static boolean contains(long [] arr, int s, int e, long target){

        boolean flag = false;
        while (s <= e){
            int mid = (s + e)/2;
            if(arr[mid] > target){
                e = mid-1;
            } else if (arr[mid] < target){
                s = mid+1;
            } else {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr [] = new long[n];
        long s1 [] = new long[n];
        long s2 [] = new long[n];

        long sum=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            sum += arr[i];
            s1[i] = sum;
        }
        long sum2=0;
        int lim = n/2;
        long ans=0;
        for (int i = 0; i < n; i++) {
            sum2 += arr[n-1-i];
            s2[i] = sum2;
            if(contains(s1, 0, n-i-2, s2[i]) && s2[i] > ans){
                ans = s2[i];
            }
        }
        System.out.println(ans);
    }
}