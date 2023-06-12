import java.util.Scanner;
public class Pyramids{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean flag = true;
        int height = 0;
        int floors = 1;

        while(flag){
            height += (floors * (floors+1))/2;
            if(height > n) {
                flag = false;
            } else {
                floors++;
            }
        }
        System.out.println(floors-1);
    }
}