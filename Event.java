import java.util.Scanner;
public class Event{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int songs = sc.nextInt();
        int time = sc.nextInt();
        int i=songs;
        while(i-- > 0){
            int len = sc.nextInt();
            time -= len;
        }

        if(time < (songs-1) * 10){
            System.out.println("-1");
        } else {
//            time -= (songs-1) * 10;

            System.out.println(time / 5);
        }
    }
}