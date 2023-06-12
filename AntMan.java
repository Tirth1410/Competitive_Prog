import java.util.Scanner;
public class AntMan{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int K = sc.nextInt();
            boolean Can = false;
            String row = sc.next();
            char [] seats = row.toCharArray();
            int count = 0;
            for(int i=0; i<n-1; i++) {
                if(seats[i] == seats[i+1] && seats[i] - '0' == 0) {
                    count++;
                    if(count >= K) {
                        Can = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }
            if(Can) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}