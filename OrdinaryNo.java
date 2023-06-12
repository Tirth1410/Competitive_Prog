import java.util.Scanner;
public class OrdinaryNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            boolean isOrd = true;
            int check = n % 10;
            while(n > 0){
                if(n % 10 != check){
                    isOrd = false;
                    break;
                }
                n /= 10;
            }
            if(isOrd){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}