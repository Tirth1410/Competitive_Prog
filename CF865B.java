import java.util.Scanner;
public class CF865B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();

            //For Odd Portion
            int OP1 = ((2*n)-1);
            int OP2 = ((2*n)-1)/2;

            for (int i = 0; i < n; i++) {
                if(i % 2 == 0){
                    System.out.print(OP1 + " ");
                    OP1 -= 2;
                } else {
                    System.out.print(OP2 + " ");
                    OP2 -= 2;
                }
            }

            System.out.println();

            //For Even portion
            int EP1 = (2*n)-2;
            int EP2 = n;

            for (int i = 0; i < n; i++) {
                if(i % 2 == 0){
                    System.out.print(EP2 + " ");
                    EP2 -= 2;
                } else {
                    if(i == n-1){
                        System.out.println(2*n);
                    } else {
                        System.out.print(EP1 + " ");
                    }
                    EP1 -= 2;
                }
            }
            System.out.println();
        }
    }
}