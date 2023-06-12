import java.util.Scanner;
public class CF95A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            long x = Long.parseUnsignedLong(sc.next());
            long y = Long.parseUnsignedLong(sc.next());
            long k = Long.parseUnsignedLong(sc.next());

            long trade = 0;
            long coal = k*y;
            long sticks = k;

            trade += (long)((coal-1) / (x-1)) + 1;

//            if((coal-1) / (x-1) == 0 && (coal - 1)){
//                trade++;
//            }

            long rem = (trade*(x-1)) + 1 - coal;
            trade += k;
            if(rem >= k){
                System.out.println(trade);
            } else {
                if((k - rem) % (x-1) == 0){
                    trade += (k - rem) / (x-1);
                } else {
                    trade += (k - rem) / (x-1) + 1;
                }
//                trade += (long)Math.ceil((k - rem) / (x-1));
                System.out.println(trade);
            }
        }
    }
}