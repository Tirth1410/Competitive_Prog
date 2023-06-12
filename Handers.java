import java.util.Scanner;
public class Handers{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int lh = sc.nextInt();
        int rh = sc.nextInt();
        int ap = sc.nextInt();

        int min = (lh < rh) ? lh : rh;
        int max = (lh > rh) ? lh : rh;
        int temp = min + ap;
        if(temp - max < 0) {
            System.out.println(temp * 2);
        } else {
            max += (temp-max)/2;
            System.out.println(max * 2);
        }
    }
}