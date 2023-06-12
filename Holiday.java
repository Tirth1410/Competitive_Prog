import java.util.Scanner;
public class Holiday{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int max=0, sum=0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int e : arr) {
            sum += (max - e);
        }

        System.out.println(sum);
    }
}