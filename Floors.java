import java.util.Scanner;
public class Floors{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int flor = sc.nextInt();
            int x = sc.nextInt();

            if(flor > 2) {
                System.out.println(((flor - 3) / x) + 2);
            } else {
                System.out.println("1");
            }
        }
    }
}