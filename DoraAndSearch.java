import java.util.Arrays;
import java.util.Scanner;
public class DoraAndSearch{
    public static void CheckArray(int [] arr, int s, int e){
        if(s > e){
            System.out.println("-1");
            return;
        }
        int [] temp = new int [e-s+1];
        for(int i=0; i<=e-s; i++){
            temp[i] = arr[s+i];
        }
        Arrays.sort(temp);
        if(arr[s] == temp[0] || arr[s] == temp[temp.length-1]){
            CheckArray(arr, s+1, e);
        } else if(arr[e] == temp[0] || arr[e] == temp[temp.length-1]){
            CheckArray(arr,  s, e-1);
        } else {
            System.out.println((s+1) + " " + (e+1));
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                temp[i] = arr[i];
            }

            CheckArray(arr, 0, arr.length - 1);
        }
    }
}