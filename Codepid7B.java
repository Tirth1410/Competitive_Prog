import java.util.Arrays;
import java.util.Scanner;
public class Codepid7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int kbps [] = new int [n];
        for (int i = 0; i < n; i++) {
            kbps[i] = sc.nextInt();
        }

        Arrays.sort(kbps);
        System.out.println(kbps[n-k]);
    }
}