import java.util.Arrays;
import java.util.Scanner;
public class Monster {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int [] monst = new int [n];

            for(int i=0; i<n; i++){
                monst[i] = sc.nextInt();
            }
            Arrays.sort(monst);
            int spell = 0;
                for(int i=0; i<n; i++) {
                    if(i == n-1){
                        spell++;
                        break;
                    }
                    if(monst[i] == monst[i+1]) {
                        spell += monst[i];
                        i += 1;
                    } else {
                        spell++;
                    }
                }

            System.out.println(spell);
        }
    }
}
