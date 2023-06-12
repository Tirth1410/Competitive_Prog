import java.util.Scanner;

public class MiskhaAndGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int Miskha = 0;
        int Chris = 0;
        while(t-- > 0){
            int M = sc.nextInt();
            int C = sc.nextInt();

            if(M > C){
                Miskha++;
            } else if(C > M){
                Chris++;
            }
        }

        if(Miskha > Chris) {
            System.out.println("Mishka");
        } else if(Chris > Miskha) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}