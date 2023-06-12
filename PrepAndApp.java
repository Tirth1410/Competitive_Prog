import java.util.Scanner;
public class PrepAndApp{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String bi = sc.next();
            int s=0, e=n-1;
            int len = n;

            while(s < e){
                if(bi.charAt(s) != bi.charAt(e)) {
                    len -= 2;
                    s++;
                    e--;
                } else {
                    break;
                }
            }
            System.out.println(len);
        }
    }
}