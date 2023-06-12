import java.util.Scanner;
public class HW{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int [] arr = new int [n];

            int eve = 0, odd = 0;
            int O1=-1, O2=-1, O3=-1, E1=-1, E2=-1;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if(arr[i] % 2 != 0){
                    odd++;
                    if(O1 == -1){
                        O1 = i+1;
                    } else if(O2 == -1){
                        O2 = i+1;
                    } else if(O3 == -1){
                        O3 = i+1;
                    } else {
                        continue;
                    }
                } else {
                    eve++;
                    if(E1 == -1){
                        E1 = i+1;
                    } else if(E2 == -1){
                        E2 = i+1;
                    } else {
                        continue;
                    }
                }
            }

            if(odd > 0 && eve > 1){
                System.out.println("YES");
                System.out.println(O1 + " " + E1 + " " + E2);
            } else if (odd > 2){
                System.out.println("YES");
                System.out.println(O1 + " " + O2 + " " + O3);
            } else {
                System.out.println("NO");
            }
        }
    }
}