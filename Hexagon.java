import java.util.Scanner;
public class Hexagon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.println((((n * (n+1)) / 2) * 6) + 1);
    }
}