import java.util.Scanner;
public class Casimir{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String S = sc.next();
            int aC = 0;
            int bC = 0;
            int cC = 0;
            for (int i = 0; i < S.length(); i++) {
                if(S.charAt(i) == 'A'){
                    aC++;
                } else if(S.charAt(i) == 'B'){
                    bC++;
                } else if(S.charAt(i) == 'C'){
                    cC++;
                }
            }
            if(aC + cC == bC){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}