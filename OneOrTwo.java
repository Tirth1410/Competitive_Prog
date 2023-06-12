import java.util.Scanner;
public class OneOrTwo{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int prod = 1;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                prod *= arr[i];
            }
            double rt = Math.sqrt(prod);
            if(rt % 1 != 0) {
                System.out.println("-1");
            } else {
                int prod1 = 1, k = 1;
                int prod2 = 1;
                for(int i=0; i<n; i++) {
                    if(prod1 == (prod / rt)) {
                        prod2 *= arr[i];
                    } else {
                        prod1 *= arr[i];
                        k = i+1;
                    }
                }
                if(prod1 == prod2){
                    System.out.println(k);
                } else {
                    System.out.println("-1");
                }
            }
        }
    }
}