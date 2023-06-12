import java.util.Scanner;
public class Hair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int des [] = new int [n];
        int alr [] = new int [n];

        for(int i=0; i<n; i++) {
            des[i] = sc.nextInt();
        }

        int j = n-1;
        for(int i=0; i<n; i++) {
            alr[i] = sc.nextInt();
            if(alr[i] - des[j] == 0) {
                j--;
            } else if(alr[i] - des[j] > 0) {
                System.out.println(alr[i]);
                System.out.println(alr[i] - des[j]);
            }
        }
    }
}