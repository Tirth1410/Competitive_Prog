import java.util.Arrays;
import java.util.Scanner;
public class Divide{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int [] arr = new int  [n];
            int lim = 2 * n;

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();

                if(arr[i] == 1){
                    arr[i]++;
                    lim--;
                }

                if(i != 0 && lim != 0 && arr[i] % arr[i-1] == 0){
                    arr[i]++;
                    lim--;
                }
            }
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}