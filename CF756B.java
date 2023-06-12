import java.util.Scanner;
public class CF756B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            long p = Long.parseUnsignedLong(sc.next());
            long m = Long.parseUnsignedLong(sc.next());

            if(p == m){
                System.out.println(p/2);
                continue;
            }
            long min = Math.min(p, m);
            long max = Math.max(p, m);

            long teams=0;

            long s = 1, e = min;

            while (s <= e){
                long mid = s + ((e-s)/2);
                long temp = 0;
                if(max >= mid*3){
                    temp = mid;
                    s = mid+1;


                } else if(max >= mid*2 && mid <= min/2){
                    temp = mid;
                    s = mid + 1;

                    if(mid % 2 != 0 && max - (mid*2) >= 3){
                        temp++;
                    }
                } else {
                    e = mid - 1;
                }

                teams = Math.max(teams, temp);
            }

            System.out.println(teams);
        }
    }
}