import java.util.*;
public class SHA8B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long height = sc.nextLong();
        long width = sc.nextLong();

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println((long)Math.floor(height / a) * (long)Math.floor(width/b));
    }
}