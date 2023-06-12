import java.util.Scanner;

public class Odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b;
        for(int k=1; k<=n; k++) {
            b = sc.nextInt();
            int Even=0, Odd=0;
            int [] arry = new int [2*b];
            for(int i = 0; i < (2*b); i++) {
                arry[i] = sc.nextInt();
                if(arry[i]%2==0) {
                    Even++;
                } else{
                    Odd++;
                }

            }

            if(Even == Odd) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}