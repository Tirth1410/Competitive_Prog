import java.util.LinkedList;
import java.util.Scanner;
public class Candies{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0){
            long n = Long.parseUnsignedLong(sc.next());

            int count = 40;
            LinkedList<Integer> list = new LinkedList<>();
            boolean flag = false;
            while (count > 0 &&  n > 1){
                if(n % 2 == 0){
                    break;
                }
                if((n+1) % 4 != 0){
                    n = (n+1)/2;
                    list.add(1);
                } else {
                    n = (n-1)/2;
                    list.add(2);
                }
                count--;
                if(n == 1){
                    flag = true;
                }
            }

            if(flag){
                System.out.println(list.size());
                for (int i = list.size()-1; i >= 0; i--) {
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
    }
}