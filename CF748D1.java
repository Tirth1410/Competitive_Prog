import java.util.Scanner;
public class CF748D1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();

            int [] arr = new int [n];

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] < min){
                    min = arr[i];
                }
            }

            for (int i = 0; i < n; i++) {
                
            }
        }
    }
}