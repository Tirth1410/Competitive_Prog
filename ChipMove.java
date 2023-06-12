import java.util.Scanner;
public class ChipMove{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int coin = 0;
        int coord [] = new int [n];

        for(int i=0; i<n; i++) {
            coord[i] = sc.nextInt();
            if(i != 0) {
                if((coord[i] - coord[0]) % 2 != 0) {
                    coin++;
                }
            }
        }
        System.out.println(coin);
    }
}