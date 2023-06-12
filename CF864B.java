import java.util.Scanner;
public class CF864B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            long k = Long.parseUnsignedLong(sc.next());
            int[][] grid = new int[n][n];
            int mid = 0;

            if(n % 2 == 0){
                mid = n/2;
            } else {
                mid = n/2 +1;
            }

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = sc.nextInt();
                    if (i >= mid && flag) {
                        if (grid[i][j] == grid[n - 1 - i][n - 1 - j]) {
                            continue;
                        } else {
                            if (k > 0) {
                                 grid[n - 1 - i][n - 1 - j] = grid[i][j];
                                k--;
                            } else {
                                flag = false;
                                continue;
                            }
                        }
                    } else if(i == n/2 && n % 2 != 0 && j >= n/2){
                        if (grid[i][j] == grid[n - 1 - i][n - 1 - j]) {
                            continue;
                        } else {
                            if (k > 0) {
                                grid[n - 1 - i][n - 1 - j] = grid[i][j];
                                k--;
                            } else {
                                flag = false;
                                continue;
                            }
                        }
                    }
                }
            }
            if(n == 1){
                System.out.println("YES");
            } else if (flag) {
                if(n % 2 != 0) {
                    System.out.println("YES");
                } else if(n % 2 == 0 && k % 2 == 0){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}