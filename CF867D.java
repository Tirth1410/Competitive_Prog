import java.util.Scanner;
public class CF867D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();

            if(n == 1){
                System.out.println("1");
            } else if(n % 2 != 0){
                    System.out.println("-1");
            } else{
                int max = n;
                int min = 2;
                int sum = n;
                int count=0;
                System.out.print(n + " ");
                while (min <= max) {
                    int req=0;
                    if (count % 2 != 0){
                        req = min-1;
                        min++;
                    } else {
                        req = max - 1;
                        max--;
                    }
                    if(sum % n < req) {
                        int temp = req - (sum % n);
                        sum += req - (sum % n);
                        System.out.print(temp + " ");
                    } else {
                        int temp = req + n-(sum%n);
                        sum += req + n-(sum%n);
                        System.out.print(temp + " ");
                    }
                    count++;
                }
                System.out.println();
            }
        }
    }
}