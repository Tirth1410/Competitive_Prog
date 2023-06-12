import java.util.Scanner;

public class KeyBoard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

        char shift = sc.next().charAt(0);
        String write = sc.next();
        char [] arr = write.toCharArray();
        if(shift == 'R'){
            for(char e : arr){
                for(int i=0; i<Keyboard.length(); i++) {
                    if (Keyboard. charAt(i) == e){
                        System.out.print(Keyboard.charAt(i-1));
                    }
                }
            }
        } else {
            for(char e : arr){
                for(int i=0; i<Keyboard.length(); i++) {
                    if (Keyboard. charAt(i) == e){
                        System.out.print(Keyboard.charAt(i+1));
                    }
                }
            }
        }
    }
}