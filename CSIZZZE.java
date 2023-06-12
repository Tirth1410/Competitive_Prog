import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class CSIZZZE{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        String s = sc.next();
        ArrayList<String> TwoG = new ArrayList<>();

        for (int i = 0; i < n-1; i++) {
            String tg = s.substring(i, i+2);
            TwoG.add(tg);
        }

        HashSet<String> set = new HashSet<String>(TwoG);
        int maxFreq = 0;
        String maxS = "";
        for(String ele : set){
            int freq = Collections.frequency(TwoG, ele);
            if(freq > maxFreq){
                maxFreq = freq;
                maxS = ele;
            }
        }

        System.out.println(maxS);
    }
}