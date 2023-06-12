import java.util.Scanner;
public class Laptop{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            boolean f = false, s = false;

            int[] price = new int[n];
            int[] qual = new int[n];

            for(int i=0; i<n; i++) {
                price[i] = sc.nextInt();
                qual[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++) {

                    if(price[i] < price[i+1] && qual[i] > qual[i+1]) {
                        f = true;
                    } else if (price[i] > price[i+1] && qual[i] < qual[i+1]) {
                        s = true;
                    }

            }
            if(f && s) {
                System.out.println("Happy Alex");
            } else {
                System.out.println("Poor Alex");
            }
    }
}