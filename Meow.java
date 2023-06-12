import java.util.Scanner;
import java.util.*;
public class Meow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String name = "Tiirrrrtthhhh";
//
//        System.out.println(name.matches("[T]+[i]+[r]+[t]+[h]+"));
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            str = str.toLowerCase();
            String temp = "";

            for(int i=0; i<n; i++) {
                if (i == 0) {
                    temp += str.charAt(i);
                } else {
                    if (str.charAt(i) == str.charAt(i - 1)) {
                        continue;
                    } else {
                        temp += str.charAt(i);
                    }
                }

//            2nd Method
                if (str.matches("[m]+[e]+[o]+[w]+")) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        }
    }
}