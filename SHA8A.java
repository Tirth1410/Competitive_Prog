import java.util.Scanner;
public class SHA8A{
    public static int StayAwake(String s, int n){
        int currTea = 0;
        int Awake = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '1'){
                currTea = 2;
                Awake++;
            } else {
                if(currTea > 0){
                    currTea--;
                    Awake++;
                } else {
                    continue;
                }
            }
        }
        return Awake;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        System.out.println(StayAwake(s, n));
    }
}