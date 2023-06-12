import java.util.Scanner;
public class Cand{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
//            int [] candies = new int [n];
            int eve = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(x % 2 == 0){
                    eve += x;
                } else {
                    odd += x;
                }
            }
            if(eve > odd){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}