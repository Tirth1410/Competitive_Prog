import java.util.Scanner;
public class OddSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int [] a = new int [n];
            int even = 0, odd = 0;

            for(int i=0; i<n; i++) {
                a[i] = sc.nextInt();
                if(a[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if(odd >= 3){
                int c=0;
                System.out.println("YES");
                for(int i=0; i<n; i++){
                    if(a[i] % 2 != 0) {
                        c++;
                        System.out.println(i+1);
                        if(c == 3){
                            break;
                        }
                    }
                }
            } else if(odd >= 1 && even >= 2){
                int o=0, e=0;
                System.out.println("YES");
                for(int i=0; i<n; i++) {
                    if (a[i] % 2 != 0 && o < 1) {
                        o++;
                        System.out.println(i+1);
                    } else if (a[i] % 2 == 0 && o < 2) {
                        e++;
                        System.out.println(i+1);
                    }
                    if(o == 1 && e == 2){
                        break;
                    }
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}