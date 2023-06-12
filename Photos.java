import java.util.Scanner;
public class Photos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int color = 0;
        for(int i=0; i<n*m; i++) {
            char k = sc.next().charAt(0);
            if (k != 'W' && k != 'B' && k != 'G'){
                color++;
            }
        }
        if(color == 0){
            System.out.println("#Black&White");
        } else {
            System.out.println("#Color");
        }
    }
}