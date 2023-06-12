import java.util.Scanner;
public class Rodion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();

        if(t == 10 && n == 1){
            System.out.println("-1");
        } else {
            if(t == 10){
                System.out.print("1");
            } else {
                System.out.print(t);
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.print("0");
            }
        }
    }
}