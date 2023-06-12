import java.util.Scanner;
public class BlackSquare{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int [] nums = new int [4];
        for(int i=0; i<4; i++) {
            nums[i] = sc.nextInt();
        }
        String seq = sc.next();
        int num = Integer.valueOf(seq);

        int cal = 0;

        while(num > 0) {
            if (num % 10 == 1) {
                cal += nums[0];
                num /= 10;
            } else if (num % 10 == 2) {
                cal += nums[1];
                num /= 10;
            } else if(num % 10 == 3) {
                cal += nums[2];
                num /= 10;
            } else {
                cal += nums[3];
                num /= 10;
            }
        }
        System.out.println(cal);
    }
}