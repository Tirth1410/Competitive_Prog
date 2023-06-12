import java.util.Scanner;
public class CardsForFrnds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- >  0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            int power = 0;
            long cards = (long) Math.pow(2, power);

            while(w % 2 == 0 || h % 2 ==0){
                if(w % 2 == 0){
                    power++;
                    cards = (long) Math.pow(2, power);
                    w /= 2;
                } else {
                    power++;
                    cards = (long) Math.pow(2, power);
                    h /= 2;
                }
            }
            if(n <= cards){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}