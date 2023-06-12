import java.util.Scanner;
public class EvenArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            int eve = 0, odd = 0;
            int c = 0, swap = 0;

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] % 2 == 0){
                    eve++;
                } else {
                    odd++;
                }

                if(i % 2 != arr[i] % 2){
                    c++;
                    if(c == 2){
                        swap++;
                        c = 0;
                    }
                }
            }
            if((eve == odd && n % 2 == 0) || (eve - odd == 1 && n % 2 != 0)) {
                System.out.println(swap);
            } else {
                System.out.println("-1");
            }
        }
    }
}