import java.util.Scanner;
public class NextPrime {
    public static boolean isPrime(int m) {
        for(int i=2; i<=(m/2); i++) {
            if(m % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int fP = 0;

        boolean found = false;
        while(!found) {
            if(isPrime(++n)) {
                fP = n;
                found = true;
                break;
            }
        }
        if(fP == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}