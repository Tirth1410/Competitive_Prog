import java.util.ArrayList;
import java.util.Scanner;
public class CodeAdda1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        while (t-- > 0){
            String s = sc.next();
            if(list.contains(s)){
                System.out.println("YES");
            } else {
                list.add(s);
                System.out.println("NO");
            }
        }
    }
}