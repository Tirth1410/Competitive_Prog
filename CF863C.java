import javax.print.DocFlavor;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.stream.*;
public class CF863C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int temp2=0;
            int temp = 0;
            for (int i = 0; i < n-1; i++) {
                temp = sc.nextInt();
                if(i == 0){
                    System.out.print(temp + " ");
                    temp2=temp;
                } else {
                    System.out.print(Math.min(temp, temp2) + " ");
                    if(i == n-1){
                        System.out.print(temp + " ");
                    }
                    temp2 = temp;
                }
            }
            System.out.println(temp);
        }
    }
}