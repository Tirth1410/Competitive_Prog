import java.util.Scanner;
public class Doors{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            String door = sc.next();
            boolean heCan = false;

            for(int i=0; i<door.length(); i++) {
                if(door.charAt(i) >= 'A' && door.charAt(i) <= 'Z') {
                    heCan = false;
                    for(int j=0; j < i; j++) {
                        if(door.charAt(j) == (char)(door.charAt(i) + 32)) {
                            heCan = true;
                            break;
                        }
                    }
                }
            }
            if(heCan) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}