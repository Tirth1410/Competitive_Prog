import java.util.Scanner;
public class CF149B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int pt1=i, pt2 = i;
                int cons = 0;
                while (pt2 < n && s.charAt(pt1) == s.charAt(pt2)){
                    cons++;
                    pt2++;
                }

                if(cons > max){
                    max = cons;
                }
            }

            System.out.println(max + 1);
        }
    }
}