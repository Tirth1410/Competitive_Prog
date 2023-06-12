import java.util.Scanner;
public class SeremaAndDima{
    public static void main(String arhs[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] card = new int [n];

        for(int i=0; i<n; i++) {
            card[i] = sc.nextInt();
        }

        int se=0, di=0;
        int s=0, e=n-1;
        int turn=0;

        while(s <= e) {
            if(turn++ % 2 == 0) {
                if(card[s] > card[e]) {
                    se += card[s];
                    s++;
                } else {
                    se += card[e];
                    e--;
                }
            } else {
                if(card[s] > card[e]) {
                    di += card[s];
                    s++;
                } else {
                    di += card[e];
                    e--;
                }
            }
        }
        System.out.println(se +" "+ di);
    }
}