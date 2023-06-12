import java.util.Scanner;
public class SHA8C{
    public static int GiveMinLength(String s){
        if(!s.contains("ab") && !s.contains("ba")){
            return s.length();
        }
        int ab = Integer.MAX_VALUE, ba = Integer.MAX_VALUE;
        if(s.contains("ab")){
            ab = GiveMinLength(s.replace("ab",""));
        }

        if(s.contains("ba")){
            ba = GiveMinLength(s.replace("ba", ""));
        }

        return Math.min(ab, ba);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();

            if(s.length() % 2 != 0){
                System.out.println("NO");
                continue;
            }
            int finallen = GiveMinLength(s);

            if(finallen == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}