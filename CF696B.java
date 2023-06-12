import java.util.Map;
import java.util.Scanner;
public class CF696B{
    public static boolean isPrime(long n){

        for (long i = 2; i < (long)Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int d= sc.nextInt();
            long Fst = 1 + d;
            boolean found = false;
            while (!found){
                if(isPrime(Fst)){
                    break;
                } else {
                    Fst++;
                }
            }

            found = false;
            long Scd = Fst + d;

            while (!found){
                if(isPrime(Scd)){
                    break;
                } else {
                    Scd++;
                }
            }

            
        }
    }
}