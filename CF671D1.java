import java.util.Arrays;
import java.util.Scanner;
public class CF671D1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] cost = new int [n];
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        Arrays.sort(cost);
        int s = 0;
        int e = n-1;

        if(n % 2 == 0){
            System.out.println((n/2) - 1);
        } else {
            System.out.println(n/2);
        }
        while (s <= e){
            if(s == e){
                System.out.print(cost[e] + " ");
                break;
            }
            System.out.print(cost[e] + " " + cost[s] + " ");
            s++;
            e--;
        }
        System.out.println();
    }
}