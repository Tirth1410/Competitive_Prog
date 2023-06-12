import java.util.Scanner;
public class CF870A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int [] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans=-1;
            for (int i = 0; i <= n; i++) {
                int lie=0;
                for (int j = 0; j < n; j++) {
                    if(i < arr[j]){
                        lie++;
                    }
                }

                if(lie == i){
                    ans = i;
                }
            }

            System.out.println(ans);
        }
    }
}

