import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;
public class PoweringHero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int strength = 0;
            int max = 0;
            int ptr = 0;
            int n = sc.nextInt();
            ArrayList<Integer> bonus = new ArrayList<>();
            int [] cards = new int [n];
            for(int i=0; i<n; i++) {
                cards[i] = sc.nextInt();

                if(cards[i] == 0){
                    for(int j=ptr; j<i; j++){
                        if(bonus.get(j) > max){
                            max = bonus.get(i);
                            ptr = j+1;
                        }
                    }

                    strength += max;
                    max = 0;

                } else {
                    bonus.add(cards[i]);
                }
            }
            System.out.println(strength);
        }
    }
}