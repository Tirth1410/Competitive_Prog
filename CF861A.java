import java.util.Scanner;

public class CF861A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ANS = 0;
            int UMAX = 0;
            for (int i = l; i <= r; i++) {
                String test = String.valueOf(i);
                int MAX = 0;
                int MIN = 9;
                for (int j = 0; j < test.length(); j++) {
                    MAX = Math.max(MAX, test.charAt(j)-'0');
                    MIN = Math.min(MIN, test.charAt(j)-'0');
                }
                if(MAX - MIN >= UMAX){
                    ANS = i;
                    UMAX = MAX - MIN;
                }
                if (UMAX == 9){
                    break;
                }
            }
            System.out.println(ANS);
        }
    }
}