import java.util.ArrayList;
import java.util.Scanner;
public class Increasing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            boolean isInc = true;
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                if(list.contains(x)){
                    isInc = false;
                }
                list.add(x);
            }

            if(isInc){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}