import java.util.Arrays;
import java.util.Scanner;
public class CF811A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();
            int [] ho = new int[n];
            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();
                int m = sc.nextInt();

                ho[i] = (h*60)+m;

                if((H*60) + M <= (h*60)+m){
                    ho[i] = ((h*60)+m) - ((H*60) + M);
                } else {
                    ho[i] = ((h*60)+m) + 1440 - ((H*60) + M);
                }
            }

            Arrays.sort(ho);
            System.out.println(ho[0] / 60 + " " + ho[0] % 60);
        }
    }
}