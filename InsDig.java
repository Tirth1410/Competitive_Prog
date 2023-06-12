import java.util.Scanner;
public class InsDig{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int dig = sc.nextInt();
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)-'0' < dig){
                    System.out.print(dig);
                    System.out.print(str.substring(i));
                    break;
                } else {
                    System.out.print(str.charAt(i));
                    if(i == str.length()-1){
                        System.out.print(dig);
                    }
                }
            }

            System.out.println();
        }
    }
}