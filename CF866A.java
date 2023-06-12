import java.util.Arrays;
import java.util.Scanner;
public class CF866A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            String s = sc.next();

            int ans = 0;
            
            if(s.length() == 1){
                if(s.charAt(0) == '^'){
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
                continue;
            }
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i) == '_' && s.charAt(i+1) == '_'){
                    ans++;
                }
            }

            if(s.charAt(0) == '_'){
                ans++;
            }

            if(s.charAt(s.length()-1) == '_'){
                ans++;
            }

            System.out.println(ans);
        }
    }
}