import java.util.Scanner;
public class Laptops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean Alex = false;
        while (n-- > 0){


                int a = sc.nextInt();
                int b = sc.nextInt();

                if(b > a){
                    Alex = true;
                }
        }
        if(Alex){
            System.out.println("Happy Alex");
        } else {
            System.out.println("Poor Alex");
        }
    }
}