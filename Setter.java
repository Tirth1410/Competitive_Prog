import java.util.Arrays;
import  java.util.Scanner;
public class Setter{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m =sc.nextInt();

        int [] arr = new int [n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++) {
            if(arr[i] - arr[i+1] > m && arr[i] - arr[i+1] >= 0) {
                arr[i+1] = arr[i] - m;
            } else if(arr[i] - arr[i+1] < ((-1) * m) && arr[i] - arr[i+1] < 0){
                arr[i] = arr[i+1] - m;
            }
        }
        for(int i=n-1; i>0; i--) {
            if(arr[i] - arr[i-1] > m && arr[i] - arr[i-1] >= 0) {
                arr[i-1] = arr[i] - m;
            } else if(arr[i] - arr[i-1] < ((-1) * m) && arr[i] - arr[i-1] < 0){
                arr[i] = arr[i-1] - m;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}