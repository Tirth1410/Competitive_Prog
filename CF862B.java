import java.util.Arrays;
import java.util.Scanner;
public class CF862B{
    public static void Arrange(String s, int n){
        if(n == 1){
            System.out.println(s);
        } else {
            char min = 'z';
            int minId = 0;
            for (int i = 0; i < n; i++) {
                if(s.charAt(i) <= min){
                    min = s.charAt(i);
                    minId = i;
                }
            }

            if(minId == 0){
                System.out.println(s);
            } else if(minId == n-1){
                System.out.println(s.charAt(minId) + "" + s.substring(0, minId));
            } else {
                System.out.println(min + "" + s.substring(0,minId) + s.substring(minId+1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            String s  = sc.next();

            Arrange(s, n);
        }
    }
}