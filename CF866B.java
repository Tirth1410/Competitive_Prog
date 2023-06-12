import java.util.Scanner;
public class CF866B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        boolean flag = true;
        int idx = 0;

        int ans=0;

        if(!s.contains("_")){
            if(s.length() > 1){
                System.out.println("0");
            } else {
                System.out.println("1s");
            }

        } else {
            while (flag && idx < sb.length()) {
                if (sb.charAt(idx) == '^') {
                    if(idx == sb.length()-1){
                        ans++;
                        idx++;
                        continue;
                    }
                    if (sb.charAt(idx + 1) == '^') {
                        idx += 2;
                    } else if (sb.charAt(idx - 1) == '^') {
                        idx++;
                    } else {
//                    String temp = sb.substring(0, idx + 1) + "^" + sb.substring(idx + 1);
//                    sb.delete(0, sb.length()-1);
//
//                    sb.append(temp);
//                    idx
                        idx++;
                    }
                } else {
                    if(idx == 0){

                    }
                    if (sb.charAt(idx - 1) != '^') {
                        String temp = sb.substring(0, idx) + "^" + sb.substring(idx);
                        sb.delete(0, sb.length() - 1);
                        sb.append(temp);
                        idx++;
                        ans++;
                    }

                    if (sb.charAt(idx + 1) != '^') {
                        String temp = sb.substring(0, idx + 1) + "^" + sb.substring(idx + 1);
                        sb.delete(0, sb.length() - 1);
                        sb.append(temp);
                        idx += 2;
                        ans++;
                    }

                }

                System.out.println(ans);
            }
        }
    }
}