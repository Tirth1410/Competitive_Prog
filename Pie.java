import java.util.Scanner;

public class Pie{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            String n = sc.next();
            String PI = "314159265358979323846264338327";
            int same=0;
            for(int i=0; i<n.length(); i++) {
                if(n.charAt(i) == PI.charAt(i)){
                    same++;
                } else {
                    break;
                }
            }

            System.out.println(same);
        }
    }
}