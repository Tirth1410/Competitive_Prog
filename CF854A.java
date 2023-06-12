import java.util.ArrayList;
import java.util.Scanner;
public class CF854A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> idx = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                int temp = sc.nextInt();
                if(!list.contains(temp) && list.size() < n){
                    list.add(temp);
                    idx.add(i+1);
                }
            }
            for (int i = 1; i <= n-list.size(); i++) {
                System.out.print("-1 ");
            }
            for (int i = list.size()-1; i >= 0; i--) {
                System.out.print(idx.get(i) + " ");
            }
            System.out.println();
        }
    }
}