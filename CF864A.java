import java.util.Scanner;
public class CF864A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = Long.parseUnsignedLong(sc.next());
            long m = Long.parseUnsignedLong(sc.next());
            long x1 = Long.parseUnsignedLong(sc.next());
            long y1 = Long.parseUnsignedLong(sc.next());
            long x2 = Long.parseUnsignedLong(sc.next());
            long y2 = Long.parseUnsignedLong(sc.next());

            if((x1 == 1 && y1 == 1) || (x2 == 1 && y2 == 1) || (x1 == 1 && y1 == m) || (x2 == 1 && y2 == m) || (x1 == n && y1 == 1) || (x2 == n && y2 == 1) || (x1 == n && y1 == m) || (x2 == n && y2 == m)){
                System.out.println("2");
            } else if(x1 == 1 || x1 == n || x2 == 1 || x2 == n || y1 == 1 || y1 == m || y2 == 1 || y2 == m){
                    System.out.println("3");
            } else {
                System.out.println("4");
            }
        }
    }
}