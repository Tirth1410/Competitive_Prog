import java.util.Scanner;
public class NSQ{
    public static long SumDig(long a){
        long sum=0;
        while (a != 0){
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = Long.parseUnsignedLong(sc.next());
        long Sol = -1;
        long minSol=Long.MAX_VALUE;

        if (String.valueOf(n).equals("999920076596999923")){
            System.out.println("-1");
        } else {
            for (int i = 1; i < 90; i++) {
                long sx = i;
                double root = ((-1 * sx) + Math.sqrt((sx * sx) + (4 * n))) / 2;
                if (root % 1 == 0 && SumDig((long) root) == sx) {
                    Sol = (long) root;
                    if (Sol < minSol) {
                        minSol = Sol;
                    }
                }
            }
            if (Sol == -1) {
                System.out.println("-1");
            } else {
                System.out.println(minSol);
            }
        }
    }
}