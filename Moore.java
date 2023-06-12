import jdk.jfr.Unsigned;

import java.util.Scanner;
public class Moore{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double t = sc.nextDouble();

//        System.out.println();
        System.out.printf("%.20f",n * (Math.pow(1.000000011, t)));
    }
}