import java.util.Scanner;
public class Rating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int rate = sc.nextInt();

            if(rate >= 1900) {
                System.out.println("Division 1");
            } else if(rate >= 1600 && rate <= 1899){
                System.out.println("Division 2");
            } else if(rate >= 1400 && rate <= 1599){
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
    }
}