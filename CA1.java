import java.util.Scanner;
public class CA1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ori = sc.next();
        int n = sc.nextInt();
        while(n-- > 0){
            String check = sc.next();
            int c=0, uc=0;
            for (int i = 0; i < ori.length(); i++) {

                if(ori.substring(i).equals(check.substring(i))){
                    c += ori.length()-i;
                    break;
                } else if(ori.indexOf(ori.charAt(i), i) == check.indexOf(ori.charAt(i), i) && check.indexOf(ori.charAt(i)) >= 0){
                    c++;
                } else if(check.indexOf(ori.charAt(i)) >= 0){
                    uc++;
                }
            }
            System.out.println(c + " " + uc);
        }
    }
}