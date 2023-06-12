import java.util.Scanner;

public class ICPCBalloon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String solv = sc.next();

            int balloon = 0;
            for(char i = 'A'; i <= 'Z'; i++){
                int count = 0;
                for(int j=0; j<n; j++) {
                    if(solv.charAt(j) == i){
                        count++;
                    }
                }
                if(count > 0) {
                    balloon += count + 1;
                    count = 0;
                }
            }
            System.out.println(balloon);
        }
    }
}