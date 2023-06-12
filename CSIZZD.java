import java.util.Arrays;
import java.util.Scanner;
public class CSIZZD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] cost = new  int  [n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        Arrays.sort(cost);

        int maxEarn = 0;
        for (int i = 0; i < n; i++) {
            if(cost[i] < 0 && m > 0){
                maxEarn += Math.abs(cost[i]);
                m--;
            } else {
                break;
            }
        }

        System.out.println(maxEarn);
    }
}