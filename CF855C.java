import java.util.*;
public class CF855C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            Stack<Long> stack = new Stack<Long>();
            stack.push((long)0);
            long strength = 0;
            for (int i = 0; i < n; i++) {
                long temp = sc.nextLong();
                if(temp == 0 && !stack.isEmpty()){
                    strength += Collections.max(stack);
                    stack.remove(stack.indexOf(Collections.max(stack)));
                    continue;
                }
                stack.push(temp);
            }

            System.out.println(strength);
        }
    }
}