import java.util.Scanner;

public class Isomania{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        boolean [] arr = new boolean [d];
        for(int i=0; i<d; i++) {
            arr[i] = true;
        }
        int count = 0;
        for(int i=0; i<d; ) {
            //For k
            if((i+1) % k == 0 && arr[i] != false){
                arr[i] = false;
                count++;
            }

            //For l
            if((i+1) % l == 0 && arr[i] != false){
                arr[i] = false;
                count++;
            }

            //For m
            if((i+1) % m == 0 && arr[i] != false){
                arr[i] = false;
                count++;
            }

            //For n
            if((i+1) % n == 0 && arr[i] != false){
                arr[i] = false;
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}