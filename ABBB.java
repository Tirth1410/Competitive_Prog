import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ABBB{
    public static void ShortLen(String s, int len){
        while(s.contains("AB") || s.contains("BB")){
            if(s.contains("AB")){
                ShortLen(s.substring(0, s.indexOf("AB")) + s.substring(s.indexOf("AB") +2), len-2);
                return;
            } else {
                ShortLen(s.substring(0, s.indexOf("BB")) + s.substring(s.indexOf("BB") +2), len-2);
                return;
            }
        }
        System.out.println(len);
        return;
    }
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int t = Integer.parseInt(bf.readLine());
        while(t-- > 0){
//            String s = sc.next();

            StringBuffer str = new StringBuffer();
            String s = bf.readLine();
            str.append(s);
            int n = str.length();
            for (int i = 0; i < str.length()-1 && i >= 0;) {
                if((str.charAt(i) == 'A' && str.charAt(i+1) == 'B') || (str.charAt(i) == 'B' && str.charAt(i+1) == 'B')){
                    str.deleteCharAt(i);
                    str.deleteCharAt(i);
                    n = str.length();
                    i = 0;
                } else {
                    i++;
                }
            }
            System.out.println(n);
        }
    }
}