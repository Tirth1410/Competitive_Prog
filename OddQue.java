import java.util.Scanner;
public class OddQue{
//    public static void FindSum(long [] arr, int l, int r, long k){
//        long sum = 0;
//        for(int i=0; i<arr.length; ){
//            if(i == l-1){
//                sum += (r-l + 1)*k;
//                i = r;
//            } else {
//                sum += arr[i];
//                i++;
//            }
//
//        }
//        if(sum % 2 == 0){
//            System.out.println("NO");
//        } else {
//            System.out.println("YES");
//        }
//    }
public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();;

        while(t-- > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            long [] arr = new long[n];
            long sum = 0;
            for (int i=0; i<n; i++){
                arr[i] = sc.nextLong();
                sum += arr[i];
            }

            for(int j=1; j<=q; j++){
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();
//                FindSum(arr, l, r, k);
                long temp = (r-l+1)*k, tempS = sum;
                for(int i=l-1; i<=r-1; i++){
                        tempS -= arr[i];
                }
                if((tempS + temp) % 2 == 0){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}