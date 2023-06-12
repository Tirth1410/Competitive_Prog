import java.util.Scanner;
public class Codepid7C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int ans = 0;
        int time = 1;
        boolean flag = true;
        while (flag){
            if((time+c)*b >= c*a){
                System.out.println(time);
                flag = false;
            } else {
                time++;
            }
        }
    }
}