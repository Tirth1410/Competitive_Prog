import java.util.Arrays;
import java.util.Scanner;
public class AmusingJoke{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        boolean joke = true;

        if(C.length() == (A.length() + B.length())) {
            char[] letters1 = new char[A.length() + B.length()];
            char[] letters2 = C.toCharArray();

            Arrays.sort(letters2);
            for (int i = 0; i < (A.length() + B.length()); i++) {
                if (i < A.length()) {
                    letters1[i] = A.charAt(i);
                } else {
                    letters1[i] = B.charAt(i - A.length());
                }
            }
            Arrays.sort(letters1);

            for(int i=0; i<C.length(); i++){
                if(letters1[i] != letters2[i]) {
                    joke = false;
                    break;
                }
            }
            if(joke) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}