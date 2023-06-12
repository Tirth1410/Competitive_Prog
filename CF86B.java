import java.util.Scanner;
public class CF86B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= (2*n) + 1; i++) {
            if(i <= n){
                for (int j = 1; j <= n-i; j++) {
                    System.out.print("  ");
                }

                for (int j = 0; j <= i; j++) {
                    if(i == 0){
                        System.out.print(j);
                    } else {
                        System.out.print(j + " ");
                    }
                }

                for (int j = i-1; j >= 0; j--) {
                    if(j == 0){
                        System.out.print(j);
                    } else {
                        System.out.print(j + " ");
                    }
                }
            } else {
                for (int j = n; j < i; j++) {
                    System.out.print("  ");
                }

                for (int j = 0; j <= (2*n)-i; j++) {

                    if(i == 2*n){
                        System.out.println(j);
                    } else {
                        System.out.print(j + " ");
                    }
                }

                for (int j = (2*n)-i-1; j >= 0; j--) {
                    if(j == 0){
                        System.out.print(j);
                    } else {
                        System.out.print(j + " ");
                    }
                }
            }
            if(i != (2*n)) {
                System.out.println();
            }
        }
    }
}