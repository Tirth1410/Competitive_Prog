import java.util.Arrays;
import java.util.Scanner;
public class RemoveSmaller {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int [] nums = new int [n];

            for(int i=0; i<n; i++) {
                nums[i] = sc.nextInt();
            }

            Arrays.sort(nums);
            boolean possible = true;

            for(int i=0; i<n-1; i++) {
                if(nums[i] - nums[i+1] > 1 || nums[i+1] - nums[i] > 1) {
                    possible = false;
                    break;
                }
            }

            if(possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
