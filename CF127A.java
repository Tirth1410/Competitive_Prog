import java.util.*;
public class CF127A{
    public static boolean isPalindrome(String s){
        if(s.length() == 1){
            return true;
        }
        if(s.length() % 2 == 0 && s.substring(0,s.length()/2).equals(s.substring(s.length()/2))){
            return true;
        } else if(s.length() % 2 != 0 && s.substring(0,s.length()/2).equals(s.substring(s.length()/2+1))){
            return true;
        }

        return false;
    }
    public static void FindSubset(String s,String take,String nottake, int idx, ArrayList<String> subset){
        if(idx == s.length()){
            subset.add(take);
            return;
        }
        FindSubset(s,take+s.charAt(idx),nottake,idx+1, subset);
        FindSubset(s,take,nottake,idx+1,subset);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> subset = new ArrayList<>();
        FindSubset(s,"","",0,subset);
//        System.out.println(subset);
        subset.remove("");
        Collections.sort(subset);

        for (int i = subset.size()-1; i >= 0; i--) {
            if(isPalindrome(subset.get(i))){
                System.out.println(subset.get(i));
                break;
            }
        }
    }
}