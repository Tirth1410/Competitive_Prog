import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            String str = sc.next();
            int count1 = 0, count2 = 0;
//            char [] arr = new char [str.length()];

            for(int i=0; i<n/2; i++) {
                if(str.charAt(i) == str.charAt(str.length()-1-i)){
                    count1++;
                } else {
                    count2++;
                }
            }

            if((count1 + count2) % 2 == 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}