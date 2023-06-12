import java.util.Scanner;
public class RoundNo{
    public static void Count(int a) {
        int c=0;
        while(a != 0){
           if(a % 10 != 0) {
               c++;
           }

           a /= 10;
        }
        System.out.println(c);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        while(n-- > 0) {
            int t = sc.nextInt();
            Count(t);


            if (t % 10 != 0) {
                System.out.println(t % 10);

                t -= (t % 10);
            }

            if (t % 100 != 0) {
                System.out.println(t % 100);

                t -= (t % 100);
            }

            if (t % 1000 != 0) {
                System.out.println(t % 1000);
                t -= (t % 1000);
            }

            if (t % 10000 != 0) {
                System.out.println(t % 10000);
                t -= (t % 10000);
            }

            if (t % 100000 != 0) {
                System.out.println(t % 100000);
                t -= (t % 100000);
            }
        }
    }
}