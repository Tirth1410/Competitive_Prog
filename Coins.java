import java.util.Scanner;
public class Coins{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int S = sc.nextInt();

        int coins = 0;
        while(S != 0){
            if(S < n) {
                coins += 1;
                S -= S;
            } else {
                coins += S / n;
                S = S % n;
            }

        }
        System.out.println(coins);
    }
}