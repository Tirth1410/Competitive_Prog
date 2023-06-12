import java.util.Scanner;
public class CF828C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (k-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            if(c == 'g'){
                System.out.println("0");
                continue;
            }
            String t = s + s;
            int ans = 0;
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);
            for (int i = start; i <= end; i++) {
                if (s.charAt(i) == c) {
                    int idx = t.indexOf('g', i + 1);
                    if (idx - i > ans) {
                        ans = idx - i;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
