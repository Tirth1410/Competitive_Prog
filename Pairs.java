import java.util.Scanner;
public class Pairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int moves = sc.nextInt();

            String str = sc.next();

            char [] arr = str.toCharArray();

            int strength=0;
            for(char i = 'a'; i<='z'; i++) {
                int small = 0, caps = 0;
                for(int j=0; j<str.length(); j++) {
                    if(arr[j] == i){
                        small++;
                    } else if(arr[j] == (char)(i - 32)){
                        caps++;
                    }
                }
                strength += Math.min(small, caps);
                if((caps - small) >= 2){
                    if((caps - small)/2 < moves){
                        strength += (caps - small)/2;
                        moves -= (caps - small) / 2;
                    } else {
                        strength += moves;
                        moves = 0;
                    }
                } else if((small - caps) >= 2){
                    if((small - caps)/2 < moves){
                        strength += (small - caps)/2;
                        moves -= (small - caps) / 2;
                    } else {
                        strength += moves;
                        moves = 0;
                    }
                }
            }
            System.out.println(strength);
        }
    }
}