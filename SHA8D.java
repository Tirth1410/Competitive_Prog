import java.util.*;

public class SHA8D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        if(arr.get(0) != 1){
            System.out.println("0");
        } else {
            HashSet<Integer> HS = new HashSet<Integer>(arr);
            int ways = 1;
            int prele = 0;
            int ans = 0;
            for (int ele : HS) {

                if(ele - prele > 1){
                    break;
                }

                int similar = Collections.frequency(arr, ele);
                ans += similar * ways;
                ways *= similar;
                prele = ele;
            }

            System.out.println(ans);
        }
    }
}