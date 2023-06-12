import java.util.Scanner;
public class Borze{
    public static void main(String args[]) {
        Scanner  sc = new  Scanner(System.in);
        String decode = sc.next();

       for(int i=0; i<decode.length(); ) {
           char a = decode.charAt(i);
           if(a == '.') {
               System.out.print("0");
               i++;
           } else {
               if(decode.charAt(i+1) == '.') {
                   System.out.print("1");
               } else {
                   System.out.print("2");
               }
               i += 2;
           }
       }
    }
}