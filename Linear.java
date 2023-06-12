import java.util.Scanner;

public class Linear{
    public static int Add(int [] arr, int s, int e){
        int idx = s+1;
        int sum=0;
        while(idx < e) {
            sum += (arr[s] * arr[idx] * arr[e]);
            idx++;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int [] arr = new int [n];

            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i=0; i<n-2; i++) {
                int s = i;
                int e = n-1;
                while(e >= 2) {
                    sum += Add(arr, s, e);
                    e--;
                }
            }
            System.out.println(sum);
        }
    }
}