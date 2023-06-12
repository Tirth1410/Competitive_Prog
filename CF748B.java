import java.util.ArrayList;
import java.util.Scanner;
public class CF748B{
    public static void FindSubset(String s, ArrayList<String> list, int idx, String n){
        if(idx == s.length()){
            list.add(n);
            return;
        }
        //TAKE
        FindSubset(s, list, idx+1, n+s.charAt(idx));

        //NOTTAKE
        FindSubset(s, list,idx+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){

            String s = sc.next();
            int n = s.length();
            int ans = Integer.MAX_VALUE;
            for(int i=0 ; i< n; i++){
                for(int j = i+1; j< n ;j++){
                    char ch1 = s.charAt(i);
                    char ch2 = s.charAt(j);



                    int val = (ch1 - '0')*10 + (ch2 -'0');
                    // out.println(val);
                    if(val%25==0){
                        int temp = n-i-2;
                        ans = Math.min(temp , ans);
                    }

                }
            }
            System.out.println(ans);

        }
    }
}