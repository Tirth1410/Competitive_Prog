import java.util.ArrayList;
import java.util.Scanner;
public class DND{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String Solv = sc.next();
            ArrayList<Character> list = new ArrayList<>();
            boolean possible = true;

            for(int i =0; i<n; i++) {
                if(!list.contains(Solv.charAt(i))){
                    list.add(Solv.charAt(i));
                } else {
                    if(Solv.charAt(i) == Solv.charAt(i-1)){
                        continue;
                    } else {
                        possible = false;
                        break;
                    }
                }
            }
            if(possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}