import java.util.Scanner;
public class Shovel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int c=0, b=k;

        boolean change = true;
        while(change) {
            if((b % 10 == r)){
                c += (b/k);
                change = false;
            } else if(b % 10 == 0) {
                c += b/k;
                change = false;
            } else {
                b += k;
            }
        }
        System.out.println(c);
    }

}