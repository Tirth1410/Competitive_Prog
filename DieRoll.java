import java.util.Scanner;
public class DieRoll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int out = 6 - Math.max(Y, Z) + 1;

        if(out == 6){
            System.out.println("1/1");
        } else if(out == 0){
            System.out.println("0/1");
        } else {
            if(out % 2 == 0){
                System.out.println((out/2) + "/" + 3);
            } else if(out % 3 == 0){
                System.out.println((out/3) + "/" + 2);
            } else {
                System.out.println(out + "/" + 6);
            }
        }
    }
}