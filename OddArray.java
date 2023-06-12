import java.util.Scanner;
public class OddArray{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int odd = 0, even = 0;
            for(int i=1; i<=n; i++){
                int x = sc.nextInt();
                if(x % 2 != 0) {
                    odd++;
                } else {
                    even++;
                }
            }
            if(odd % 2 != 0 || (odd != 0 && even != 0)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}