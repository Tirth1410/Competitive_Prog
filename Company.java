import java.util.ArrayList;
import java.util.Scanner;
public class Company{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> growth = new ArrayList<>();
        for(int i=0; i<n; i++){
            growth.add(sc.nextInt());
        }
        if(growth.indexOf(1) != -1){
            int idx = growth.indexOf(1);

            int req = 2, c=1;
            for (int i = idx; i < n; i++) {
                if(growth.get(i) == req){
                    growth.add(2001+i);

                    req++;
                    c++;
                }
            }
            System.out.println(c);
            System.out.print((2001+idx) + " ");
            for (int i = n; i < growth.size(); i++) {
                System.out.print(growth.get(i) + " ");
            }
        } else {
            System.out.println("0");
        }
    }
}