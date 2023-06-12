import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Juggler{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int i=n;
            boolean iseq = true;
            ArrayList<Character> list = new ArrayList<>();
            while(i-- > 0) {
                String str = sc.next();
                for (char e : str.toCharArray()) {
                    list.add(e);
                }
            }
            Collections.sort(list);

            if(list.get(0) == list.get(list.size()-1)) {
                if(list.size() % n == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                for(int j=0; j< list.size(); j++) {

                    for(int k=j; k<list.size(); k++) {
                        if(list.get(j) != list.get(k)) {
                            if((k-j) % n == 0 && k != list.size()-1) {
                            }else {
                                iseq = false;
                                break;
                            }
                            j = k;
                        }
                    }
                }
                if(iseq) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}