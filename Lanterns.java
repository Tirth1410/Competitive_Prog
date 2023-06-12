import java.util.Arrays;
import java.util.Scanner;
public class Lanterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int [] pos = new int [n];

        for(int i=0; i<n; i++){
            pos[i] = sc.nextInt();
        }

        Arrays.sort(pos);

        double in = pos[0] - 0;
        double in2 = l - pos[n-1];
        double max = 0;

        for(int i=0; i<n-1; i++){
            if(pos[i+1] - pos[i] > max){
                max = pos[i+1] - pos[i];
            }
        }

        if((max/2) >= in && (max/2) >= in2){
            System.out.println(max/2);
        } else {
            double max2 = Math.max(in, in2);
            if(max2 > max/2){
                System.out.println(max2);
            }
        }
    }
}