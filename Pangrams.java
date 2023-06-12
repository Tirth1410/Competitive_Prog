import java.util.Scanner;
public class Pangrams {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str = sc.next();

        boolean pangrams = true;


        for(char i = 'a'; i<= 'z'; i++) {
            int c=0;
            for(int j=0; j<str.length(); j++) {
                if((str.charAt(j) == i) || (str.charAt(j) == (char)(i-32))){
                    c++;
                    j = str.length();
                    continue;
                }
            }
            if(c == 0) {
                pangrams = false;
                break;
            }
        }
        if(pangrams) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
