import java.util.Scanner;
public class Checking {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            char a = sc.next().charAt(0);
            String cmp = "codeforces";
            boolean Present = false;
            for(int i = 0; i<cmp.length(); i++) {
                if(a == cmp.charAt(i)) {
                    Present = true;
                    break;
                }
            }
            if(Present) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}