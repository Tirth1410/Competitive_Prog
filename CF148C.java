import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class CF148C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            ArrayList<Long> list = new ArrayList<>();
            long prev = -1;
            for (int i = 0; i < n; i++) {
                long temp = sc.nextLong();
                if(i == 0){
                    list.add(temp);
                    prev = temp;
                    continue;
                }
                if(temp != prev){
                    list.add(temp);
                    prev = temp;
                    continue;
                }
            }

            int ans = list.size();

            for (int i = 0; i < list.size()-2; i++) {
                if (list.get(i) < list.get(i+1) && list.get(i+1) < list.get(i+2)){
                    ans--;
                    continue;
                }
                if (list.get(i) > list.get(i+1) && list.get(i+1) > list.get(i+2)){
                    ans--;
                    continue;
                }
            }
            if (ans == 0){
                System.out.println(ans+1);
            }
            System.out.println(ans);
        }
    }
}