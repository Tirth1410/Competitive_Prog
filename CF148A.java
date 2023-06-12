import java.util.Scanner;
public class CF148A{
    public static boolean isPalindrome(String s){
        int mid = s.length()/2;
        int i=0;
        char test = s.charAt(0);
        while (i < mid){
            if(s.charAt(i) != test){
                return true;
            }
            i++;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            if(isPalindrome(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}