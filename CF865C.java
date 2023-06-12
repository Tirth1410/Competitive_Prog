import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class CF865C {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            long [] arr = new long[n];

            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            int maxId = 0;
            int minId = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseUnsignedLong(String.valueOf(sc.next()));
                if(arr[i] > max){
                    max = arr[i];
                    maxId = i;
                }

                if(arr[i] < min){
                    min = arr[i];
                    minId = i;
                }
            }

            if(minId == 1 && maxId == n-2){
                System.out.println("NO");
            } else {
                if (Math.abs(maxId - minId) == 1){
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}