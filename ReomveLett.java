import java.util.ArrayList;
import java.util.Scanner;
public class ReomveLett{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            //Optimal Solution
            int n=sc.nextInt();
            String str=sc.next();
            long res=n-1;
            for(int i=1;i<str.length()-1;i++) {
                if(str.charAt(i+1)==str.charAt(i-1)) {
                    res--;
                }
            }
            System.out.println(res);



//            Rigth Solution But Time limit Exceed


//            int n = sc.nextInt();
//            String str = sc.next();
//
//            ArrayList<String> list = new ArrayList<>();
//            int s=0, e=1;
//
//            while(e < str.length()){
//                String temp = "";
//                 temp += str.substring(0, s);
//                 temp += str.substring(e+1);
//
//                 if(!list.contains(temp)){
//                     list.add(temp);
//                 }
//                 e++;
//                 s++;
//            }
//            System.out.println(list.size());
        }
    }
}