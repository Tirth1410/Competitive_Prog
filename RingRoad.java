import java.util.Scanner;
public class RingRoad{
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();

            int [] tasks = new int [m];
            long time = 0;
            for(int i=0; i<m; i++){
                tasks[i] = sc.nextInt();
                if(i == 0){
                    time += tasks[i]-1;
                }
                if(i > 0){
                    if(tasks[i] < tasks[i-1]) {
                        time += tasks[i] + n- tasks[i-1];
                    } else {
                        time += tasks[i] - tasks[i-1];
                    }
                }
            }
            System.out.println(time);
        }
}