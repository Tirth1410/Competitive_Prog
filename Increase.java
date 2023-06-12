import java.util.Scanner;
public class Increase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];
        int max = 1;
        int c = 1;
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
            if(i > 0 && arr[i] > arr[i-1]){
                c++;
                if(c >  max){
                    max = c;
                }
            } else {
                c = 1;
            }
        }
        System.out.println(max);
    }
}