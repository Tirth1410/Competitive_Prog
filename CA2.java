import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class CA2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }

        if(list.contains(1)){
            System.out.println("YES");
        } else {
            Collections.sort(list);
            int eve=0, odd=0;
            int eveIdx=0, oddIdx=0;
                for (int i = 0; i < n; i++) {
                    if(list.get(i) % 2 == 0 && list.get(i) != 0 && eve < 1){
                        if((odd != 0 && list.get(i) % list.get(oddIdx) != 0) || odd == 0){
                            eve++;
                            eveIdx = i;
                        }
                    } else if(list.get(i) % 2 != 0 && odd < 1){
                        if((eve != 0 && list.get(i) % (list.get(i)%list.get(eveIdx)) != 0) || odd == 0){
                            odd++;
                            oddIdx = i;
                        }
                    }

                    if(eve != 0 && odd != 0){
                        break;
                    }
                }

        }
    }
}