import java.util.Scanner;
public class PairwiseMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            long a=1, b=1, c=1;

            if((x != y) && (y != z) && (z != x)){
                System.out.println("NO");
            } else {
                if(x == y && y == z){
                    System.out.println("YES");
                    System.out.println(x + " " + y + " " + x);
                } else if((x == y)){
                    a = x;
                    if(x < z){
                        System.out.println("NO");
                    } else {
                        b = z;
                        c = z;
                        System.out.println("YES");
                        System.out.println(a + " " + b + " " + c);
                    }
                } else if(y == z){
                    c = y;
                    if(y < x){
                        System.out.println("NO");
                    } else {
                        a = x;
                        b = x;
                        System.out.println("YES");
                        System.out.println(a + " " + b + " " + c);
                    }
                } else if(x == z){
                    b = x;
                    if(x < y){
                        System.out.println("NO");
                    } else {
                        c = y;
                        a = y;
                        System.out.println("YES");
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}