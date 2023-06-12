import java.util.Arrays;
import java.util.Scanner;
public class LexString{
    public static void FindC(char [] one, char [] two, String C, int c1, int c2, int k, int p1, int p2){
        if(p1 == one.length || p2 == two.length){
            System.out.println(C);
            return;
        }
        if(one[p1] < two[p2] && c1 < k){
            FindC(one, two, C += one[p1], c1+1, 0, k, p1+1, p2);

        } else if(c2 < k){
            FindC(one, two, C += two[p2], 0, c2+1, k, p1, p2+1);
        } else {
            FindC(one, two, C += one[p1], c1+1, 0, k, p1+1, p2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String A = sc.next();
            char[] Aa = A.toCharArray();
            String B = sc.next();
            char[] Bb = B.toCharArray();

            Arrays.sort(Aa);
            Arrays.sort(Bb);
            String c = "";
            FindC(Aa, Bb, c, 0, 0, k, 0, 0);
        }
    }
}