import java.util.Scanner;
public class Lunch{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();

         while(t-- > 0) {
             int a = sc.nextInt();
             int h = sc.nextInt();
             int d = sc.nextInt();
             int len = 0;
             if(a > h) {
                 len = a-h;
             } else {
                 len = h-a;
             }

             if(len % d == 0) {
                 System.out.println(len / d);
             } else {
                 System.out.println((len/d) + 1);
             }
         }
    }
}