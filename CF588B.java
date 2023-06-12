import java.util.Scanner;
public class CF588B{
    public static String FindMinNO(String ans, String s, int n, int k){
        if(k <= 0 || s.equals("")){
            return ans + s;
        }

        if (s.length() == 1 && s.charAt(0) != '0'){
            k--;
            ans += "0";
            return FindMinNO(ans, s.substring(1), n, k);
        }
        if (s.charAt(0) != '1' && s.length() == n) {
            k--;
            ans += "1";
            return FindMinNO(ans, s.substring(1), n, k);
        }
        if(s.charAt(0) != '0' && s.length() != n) {
            k--;
            ans += "0";
            return FindMinNO(ans, s.substring(1), n, k);
        }
        ans += s.charAt(0);
        return FindMinNO(ans, s.substring(1), n, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String s = sc.next();

//        String ans = FindMinNO("", s, n, k);
//        System.out.println(ans);

        if (k == 0){
            System.out.println(s);
            return;
        }

        if(s.length() == 1){
            System.out.println("0");
            return;
        }


        StringBuffer SB = new StringBuffer();
        SB.append("1");
        if (s.charAt(0) != '1'){
            k--;
//            SB.append("1");
        }
        int idx=1;
        while (k > 0 && idx < n){
            SB.append("0");
            if(s.charAt(idx) != '0') {
                k--;
            }
            idx++;
        }

        if(idx < n){
            SB.append(s.substring(idx));
//            System.out.println(SB);
        }
        System.out.println(SB);
    }
}