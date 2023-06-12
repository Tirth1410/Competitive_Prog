import java.util.Scanner;
public class CF871C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n =  sc.nextInt();
            int m11 = Integer.MAX_VALUE;
            int m01 = Integer.MAX_VALUE;
            int m10 = Integer.MAX_VALUE;

            while (n-- > 0){
                int m = sc.nextInt();
                String s = sc.next();

                if(s.equals("11")){
                    if(m < m11){
                        m11 = m;
                    }
                } else if(s.equals("01")){
                    if(m < m01){
                        m01 = m;
                    }
                } else if(s.equals("10")){
                    if(m < m10){
                        m10 = m;
                    }
                }
            }

            if(m11 == Integer.MAX_VALUE && (m01 == Integer.MAX_VALUE || m10 == Integer.MAX_VALUE)){
                System.out.println("-1");
            } else {
                System.out.println(Math.min(m11,((long) m01+(long) m10)));
            }
        }
    }
}