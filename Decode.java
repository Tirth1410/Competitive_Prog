import java.util.ArrayList;
import java.util.Scanner;
public class Decode{
    public static void Givestr(char arr [], int n){

        for(int i=0; i<n; i++) {
            int x  = 0;
            if(i + 2 < n && arr[i+2] - '0' == 0 && arr[i+3] - '0' != 0) {
                x = ((arr[i] - '0') * 10) + (arr[i+1] - '0');
               System.out.print((char)(96 + x));
                i += 2;
            } else {
                x = arr[i] - '0';
                System.out.print((char)(96 + x));
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String code = sc.next();
            char [] arr = new char[n + 2];
            for(int i=0; i<n; i++) {
                arr[i] = code.charAt(i);
            }

            arr[n] = 'x';
            arr[n+1] = '\0';
            Givestr(arr, n);
            System.out.println();
        }
    }
}