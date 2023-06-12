import java.util.Scanner;
public class DF637A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int time = sc.nextInt();
            int [] a = new int [n];
            int [] b = new int [n];
            int [] c = new int [n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

                c[i] = a[i] + i;
            }

            int bmax=0, idx=-1;
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                if(b[i] > bmax && c[i] <= time){
                    bmax = b[i];
                    idx = i+1;
                }
            }

            System.out.println(idx);
        }
    }
}