import java.util.Scanner;
public class CSIZZZF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] cord = new long [n];
        int even=0, odd=0;
        for (int i = 0; i < n; i++) {
            cord[i] = sc.nextLong();
            if(cord[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println(Math.min(even,odd));
    }
}