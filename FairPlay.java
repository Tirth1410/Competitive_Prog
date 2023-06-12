import java.util.Arrays;
import java.util.Scanner;
public class FairPlay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int [] arr = new int [4];
            int [] ref = new int [4];

            for(int i=0; i<4; i++) {
                arr[i] = sc.nextInt();
                ref[i] = arr[i];
            }
            Arrays.sort(ref);

            int a = Math.max(arr[0], arr[1]);
            int b = Math.max(arr[2], arr[3]);

            if((a == ref[3] || a == ref[2]) && (b == ref[2] || b == ref[3])){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}