import java.util.Scanner;
public class BeautifulSeq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            long [] arr = new long[n];

            boolean isPoss = false;
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseUnsignedLong(sc.next());

                if(arr[i] == i+1 || arr[i] < i+1){
                    isPoss = true;
                }
            }

            if(isPoss){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}