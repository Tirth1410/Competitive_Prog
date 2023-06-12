import java.util.Scanner;
public class BalanceArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            if(n % 4 != 0){
                System.out.println("NO");
            } else{

                System.out.println("YES");
                int sum = 0;
                for(int i=1; i<=n/2; i++){
                    System.out.print((2 * i) + " ");
                    sum += 2*i;
                }

                for(int i=1; i<=n/2; i++){

                    if(i != (n/2)) {
                        sum -= ((2 * i) - 1);
                        System.out.print(((2 * i) - 1) + " ");
                    }else {
                        System.out.print(sum);
                    }
                }

                System.out.println();
            }
        }
    }
}