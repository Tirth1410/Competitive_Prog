import java.util.Scanner;
public class Codepid7A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos [] = new int [n];
        int pos1 = 0, pos2=0;
        for (int i = 0; i < n; i++) {
            pos[i] = sc.nextInt();
            if(pos[i] == 1){
                pos1 = i;
            }
            if(pos[i] == n){
                pos2 = i;
            }
        }

        int dis1 = Math.min(pos1, n-1-pos1);
        int dis2 = Math.min(pos2, n-1-pos2);

        System.out.println(n -1 - Math.min(dis1, dis2));
    }
}