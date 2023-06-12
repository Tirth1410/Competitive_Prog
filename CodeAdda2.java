import java.util.Arrays;
import java.util.Scanner;
public class CodeAdda2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int req = 1;
        int days = 0;
        int [] que = new int [n];
        for (int i = 0; i < n; i++) {
            que[i] = sc.nextInt();
        }

        Arrays.sort(que);
        for (int i = 0; i < n; i++) {
            if(req <= que[i]){
                days++;
                req++;
            }
        }

        System.out.println(days);
    }
}