import java.util.Arrays;
import java.util.Scanner;
public class MeanEq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int [2 * n];
            for(int i=0; i< (2 * n); i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0; i < n; i++) {
                int temp = arr[2 * i];
                arr[2 * i] = arr[(2 * i) + 1];
                arr[(2 * i) + 1] = temp;
            }

            for(int e : arr){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}