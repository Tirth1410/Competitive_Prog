import java.util.ArrayList;
import java.util.Scanner;
public class Restore{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i=1; i<=2*n; i++){
                int x = sc.nextInt();
                if(!list.contains(x)){
                    list.add(x);
                    System.out.print(x + " ");

                }
            }
            System.out.println();
        }
    }
}