import java.util.Arrays;
import java.util.Scanner;
public class Image{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            String A = sc.next();
            String B = sc.next();

            char [] color = {A.charAt(0), A.charAt(1), B.charAt(0), B.charAt(1)};
            Arrays.sort(color);
            int change=0;
            for(int i=0; i<3; i++) {
                if(color[i] != color[i+1]) {
                    change++;
                }
            }

            System.out.println(change);
        }
    }
}