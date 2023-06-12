import java.util.ArrayList;
import java.util.Scanner;
public class RecentAct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-- >  0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> moments= new ArrayList<>();
            ArrayList<Integer> pos= new ArrayList<>();
            for(int i=0; i<m; i++) {
                int a = sc.nextInt();
                if(!moments.contains(a)){
                    moments.add(a);
                    pos.add(i+1);
                }
            }
            int k=Math.min(n-1, pos.size()-1);
            //int j=0;
            for(int j=0; j < n; j++) {
                if(j < n - moments.size()) {
                    System.out.print("-1 ");
                } else {
                    System.out.print(pos.get(k) + " ");
                    k--;
                }
            }
//            for( ; k >= 0;) {
//
//
//            }

        }
    }
}