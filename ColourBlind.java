import java.util.Scanner;
public class ColourBlind{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            boolean flag = true;

            for(int i=0; i<n; i++){
                if((A.charAt(i) != B.charAt(i) && (A.charAt(i) - B.charAt(i) == 'G'-'B' || A.charAt(i) - B.charAt(i) == 'B' - 'G')) || A.charAt(i) == B.charAt(i)){
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}