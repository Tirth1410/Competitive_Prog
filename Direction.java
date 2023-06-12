import java.util.Scanner;
public class Direction{
    public static void main(String  args[] ){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String moves = sc.next();
            int x=0,y=0;
            boolean Pass = false;

            for(int i=0; i<n; i++) {
                switch (moves.charAt(i)) {
                    case 'L':
                        x--;
                        break;
                    case 'R':
                        x++;
                        break;
                    case 'U':
                        y++;
                        break;
                    case 'D':
                        y--;
                        break;
                }
                if(x==1 && y==1) {
                    Pass = true;
                    break;
                }
            }
            if(Pass) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}