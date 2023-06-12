import java.util.Scanner;
public class GiftFix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int [] candy = new int [n];
            int [] orange = new int [n];

            int minCan = Integer.MAX_VALUE, minOrg = Integer.MAX_VALUE;
            for(int i=0; i<n; i++) {
                candy[i] = sc.nextInt();
                if(candy[i] < minCan) {
                    minCan = candy[i];
                }
            }
            for(int i=0; i<n; i++) {
                orange[i] = sc.nextInt();
                if(orange[i] < minOrg) {
                    minOrg = orange[i];
                }
            }

            long move = 0;
            for(int i=0; i<n; i++) {
                if(candy[i] > minCan && orange[i] > minOrg){
                    int diff = Math.min(candy[i]-minCan, orange[i]-minOrg);
                    move += diff;
                    candy[i] -= diff;
                    orange[i] -= diff;
                }

                if(candy[i] > minCan){
                    move += candy[i] - minCan;
                }
                if(orange[i] > minOrg){
                    move += orange[i] - minOrg;
                }
            }
            System.out.println(move);
        }
    }
}