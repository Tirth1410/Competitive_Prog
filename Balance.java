import java.util.Scanner;
public class Balance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int Sum1 = 0;
            int Sum2 = 0;
            for(int i=1; i<=n; i++){

                if(i < n/2 || i == n){
                    Sum1  += Math.pow(2, i);
                } else {
                    Sum2 += Math.pow(2, i);
                }
            }
            if(Sum1 > Sum2){
                System.out.println(Sum1 - Sum2);
            } else {
                System.out.println(Sum2 - Sum1);
            }
        }
    }
}