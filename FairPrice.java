import java.util.Scanner;
public class FairPrice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            int Sum1 = 0, Sum2 = 0;
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] == 1){
                    Sum1 += arr[i];
                } else {
                    Sum2 += arr[i];
                }
            }

            if(Sum1 % 2 == 0 && Sum2 % 2 == 0 && (Sum2 / 2) % 2 == 0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}