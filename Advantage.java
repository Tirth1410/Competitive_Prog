import java.util.Arrays;
import java.util.Scanner;
public class Advantage{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int [] part = new int [n];
            int [] ref = new int [n];

            for(int i=0; i<n; i++) {
                part[i] = sc.nextInt();
                ref[i] = part[i];
            }

            Arrays.sort(ref);

            for(int e : part) {
                if(e == ref[n-1]) {
                    System.out.println(e - ref[n-2]);
                } else {
                    System.out.println(e - ref[n-1]);
                }
            }
        }
    }
}