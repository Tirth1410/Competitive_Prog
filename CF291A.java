import  java.util.Scanner;
public class CF291A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            int e = s.charAt(i)-'0';

            if(i == 0 && e == 9){
                System.out.print(e);
                continue;
            }

            if(e > 9-e){
                System.out.print(9-e);
            } else {
                System.out.print(e);
            }
        }
    }
}