import java.util.Arrays;
import java.util.Scanner;
public class CF14B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long D = sc.nextInt();
        long [] pow = new long [n];
        for (int i = 0; i < n; i++) {
            pow[i] = sc.nextLong();
        }
        Arrays.sort(pow);
        int team=0;
        int players = n;
        for (int i = n-1; i >= 0; i--) {
            long req = D/pow[i];
            req++;

            if(players <= 0 || players < req){
                break;
            } else {
                players -= req;
                team++;
            }
        }
        System.out.println(team);
    }
}