import java.util.Scanner;
public class CF111A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int sum= sc.nextInt();
            sum--;
            int c=1;
            int i=1;
            while(sum > 0){
                if(i + 2 <= sum){
                    sum -= i+2;
                    i += 2;
                    c++;
                }

                if(sum <= i + 2 && sum != 0){
                    c++;
                    sum -= sum;
                }
            }
            System.out.println(c);
        }
    }
}