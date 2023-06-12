import java.math.BigInteger;
import java.util.Scanner;
public class CF865A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while (t-- > 0){
            long a = Long.parseUnsignedLong(sc.next());
            long b = Long.parseUnsignedLong(sc.next());
            long gcd = Long.valueOf(String.valueOf(BigInteger.valueOf(a).gcd(BigInteger.valueOf(b))));

            if(Long.valueOf(String.valueOf(BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)))) == 1){
                System.out.println("1");
                System.out.println(a + " " + b);
            } else {
                System.out.println("2");
                if(a / gcd == 1 && b / gcd == (a-1)){
                    System.out.println("1 " + (b-1));
                } else {
                    System.out.println((a - 1) + " 1");
                }
                System.out.println(a + " " + b);
            }
        }
    }
}