import java.util.Scanner;
public class Rank{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] tot = new int [n];
        int rank = 1;

        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            tot[i] = a+b+c+d;
            if(i > 0) {
                if(tot[i] > tot[0]) {
                    rank++;
                }
            }
        }
        System.out.println(rank);
    }
}