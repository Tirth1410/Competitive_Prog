import java.util.Arrays;
import java.util.Scanner;
public class CF145A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();;
        while(t-- > 0){
            String n = sc.next();
            char [] arr = n.toCharArray();
            Arrays.sort(arr);
            if(arr[0] == arr[3]){
                System.out.println("-1");
            } else {
                if(arr[0] == arr[2] || arr[1]==arr[3]){
                    System.out.println("6");
                } else if(arr[0] == arr[1] || arr[1]==arr[2] || arr[2]==arr[3]){
                    if(arr[0] == arr[1] && arr[2] == arr[3]){
                        System.out.println("4");
                    } else {
                        System.out.println("6");
                    }
                } else {
                    System.out.println("4");
                }
            }
        }
    }
}