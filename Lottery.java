import java.util.Scanner;
public class Lottery{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    long hundred=0, twenty=0, ten=0, five=0, one=0;

    hundred = n/100;
    n = n%100;

    twenty = n/20;
    n = n%20;

    ten = n/10;
    n = n%10;

    five = n/5;
    n = n%5;

    one = n/1;
    n = n%1;

    System.out.println(hundred + twenty + ten + five + one);
    }
}