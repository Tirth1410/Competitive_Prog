import java.util.Scanner;
public class CF871B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();

            if(n == 1){
                int tem=sc.nextInt();
                if (tem == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(1);
                }
                continue;
            }

            int cons = 0;
            boolean flag=true;
            int maxBlank = Integer.MIN_VALUE;
            while (n-- > 0){
                int temp = sc.nextInt();
                if(temp == 0){
                    if(flag == true){
                        cons++;
                    } else {
                        cons = 1;
                        flag = true;
                    }
                } else {
                    flag=false;
                    cons=0;
                }

                if(cons > maxBlank){
                    maxBlank = cons;
                }

            }

            System.out.println(maxBlank);
        }
    }
}