import java.util.ArrayList;
import java.util.Scanner;
public class Rep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<Character> eve = new ArrayList<>();
            ArrayList<Character> odd = new ArrayList<>();

            boolean isPoss = true;
            for(int i=0; i<s.length(); i++){
                if(i % 2 == 0){
                    if(!odd.contains(s.charAt(i))){
                        eve.add(s.charAt(i));
                    } else {
                        isPoss = false;
                        break;
                    }
                } else {
                    if(!eve.contains(s.charAt(i))){
                        odd.add(s.charAt(i));
                    } else {
                        isPoss = false;
                        break;
                    }
                }
            }
            if(isPoss){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}