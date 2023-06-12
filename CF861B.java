import java.util.Scanner;
public class CF861B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][] arr =  new int [n][m];

            int prize=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                    for (int k=0; k<i; k++){
                        prize += Math.abs(arr[k][j] - arr[i][j]);
                    }
                }
            }
            System.out.println(prize);
        }
    }
}