import java.util.Scanner;
public class AmanAndStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String A = sc.next();
        String B = sc.next();

        int sumA = 0, sumB = 0;
        for(int i=0; i<n; i++) {
            sumA += (int)A.charAt(i);
        }
        for(int j=0; j<m; j++) {
            sumB += (int)B.charAt(j);
        }

        if(sumA < sumB) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
