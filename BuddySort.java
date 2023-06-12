import java.util.Scanner;
public class BuddySort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("-1");
        } else {
            System.out.print(n + " ");
            for(int i = 1; i<=n-1; i++) {
                System.out.print(i + " ");
            }
        }
    }
}