import  java.util.*;
public class CSIZZZJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n*m % 3 == 0){
                System.out.println((n*m)/3);
            } else {
                System.out.println((n*m) / 3 + 1);
            }
        }
    }
}