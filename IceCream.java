import java.util.Scanner;
public class IceCream{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s2 = sc.nextLine();
        int idx = s2.indexOf(' ');
        int n = Integer.parseInt(s2.substring(0, idx));
        long X = Long.parseLong(s2.substring(idx+1));
        int dis = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            if(str.charAt(0) == '+'){
                X += Long.parseLong(str.substring(2));
            } else  {
                if(X < Long.parseLong(str.substring(2))){
                    dis++;
                    continue;
                } else {
                    X -= Long.parseLong(str.substring(2));
                }
            }
        }
        System.out.println(X + " " + dis);
    }
}