import java.util.Scanner;
public class Sequence{
    public static void Arrange(int [] num, int len){

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int [] num = new int [n];
            for(int i=0; i<n; i++) {
                num[i] = sc.nextInt();
            }

            Arrange(num, n);
        }
    }
}