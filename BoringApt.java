import java.util.Scanner;

public class BoringApt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int digpress = 0;
            digpress += ((n % 10) - 1) * 10;

            int count = 0;
            while(n != 0){
                count++;
                n /= 10;
            }

            System.out.println(((count * (count+1))/2) +  digpress);
        }
    }
}