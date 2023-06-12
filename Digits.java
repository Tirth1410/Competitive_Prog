import java.util.Scanner;
public class Digits{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int k2 = sc.nextInt();
        int k3 = sc.nextInt();
        int k5 = sc.nextInt();
        int k6 = sc.nextInt();

        int sum = 0;

        int min = (k2 < k5) ? ((k2 < k6) ? k2 : k6) : ((k5 < k6) ? k5 : k6);
        sum += 256 * min;

        k2 -= min;
        k5 -= min;
        k6 -= min;

        if(k2 < k3) {
            sum += 32 * k2;
        } else {
            sum += 32 * k3;
        }

        System.out.println(sum);
    }
}
