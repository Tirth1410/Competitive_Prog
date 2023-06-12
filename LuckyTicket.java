import java.util.Scanner;
public class LuckyTicket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();

            int sum1=0, sum2=0;

            for(int i=0; i<str.length(); i++){
                if(i < str.length()/2){
                    sum1 += str.charAt(i) - '0';
                } else {
                    sum2 += str.charAt(i) - '0';
                }
            }
            if(sum1 == sum2){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}