import java.util.Scanner;
public class CF871A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        String test = "codeforces";
        while (t-- > 0){
            String s = sc.next();
            int var = 0;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != test.charAt(i)){
                    var++;
                }
            }

            System.out.println(var);
        }
    }
}