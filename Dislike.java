import java.util.Scanner;
public class Dislike{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int k = sc.nextInt();
            int count = 1, i=1;
            boolean flag = true;
            while(flag) {
               if((i % 3 == 0) || (i % 10 == 3)) {
                   i++;
                   continue;
               } else {
                   if(count == k) {
                       System.out.println(i);
                       flag = false;
                   }
                   i++;
                   count++;
               }
            }
        }
    }
}