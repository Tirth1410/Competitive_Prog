import java.util.Scanner;
public class CSIZZZL {
    public static void CanPass(int n, String s, int X, int Y, int idx){

        if(X == 1 && Y == 1){
            System.out.println("YES");
            return;
        }
        if(idx == n){
            System.out.println("NO");
            return;
        }
        if(s.charAt(idx) == 'U'){
            Y++;
        } else if (s.charAt(idx) == 'D'){
            Y--;
        } else if (s.charAt(idx) == 'L'){
            X--;
        } else {
            X++;
        }
        CanPass(n, s, X, Y, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            CanPass(n, s, 0, 0, 0);
        }
    }
}