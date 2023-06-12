import java.util.Arrays;
import java.util.Scanner;
public class MeetingFrnds{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int [] co = new int [3];
        for(int i=0; i<3; i++) {
            co[i] = sc.nextInt();
        }
        Arrays.sort(co);

        System.out.println((co[2] - co[1]) + (co[1] - co[0]));
    }
}