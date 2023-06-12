import java.util.ArrayList;
import java.util.Scanner;
public class FiboWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(13);
        list.add(21);

        boolean isFibo = true;
        if(s.length() > 1) {
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i+2)-'A' != (((s.charAt(i)-'A') + (s.charAt(i+1)-'A')) % 26)) {
                    isFibo = false;
                    break;
                }
            }
        }

        if(isFibo){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}