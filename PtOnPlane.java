import java.util.Scanner;
public class PtOnPlane{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            Long n = sc.nextLong();
            if((n-1) % 4 == 0 && n<4){
                    System.out.println((n - 1) / 4);
            } else {
                System.out.println(((n-1)/4)+1);
            }
        }
    }
}