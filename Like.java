import java.util.Scanner;
public class Like{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int neg=0, pos=0;
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                if(x < 0){
                    neg++;
                } else {
                    pos++;
                }
            }
            for(int i=1; i<=n; i++){
                if(i<=pos) {
                    System.out.print(i + " ");
                } else {
                    System.out.print((2*pos)-i + " ");
                }
            }
            System.out.println();
            int c=1;
            for(int i=1; i<=n; i++){
                    if(i % 2 != 0){
                        if(neg > 0) {
                            System.out.print("1 ");
                        } else {
                            System.out.print(c+ " ");
                            c++;
                        }
                    } else {
                        if(neg > 0) {
                            neg--;
                            System.out.print("0 ");
                        } else {
                            System.out.print(c+ " ");
                            c++;
                        }
                    }

            }
            System.out.println();
        }
    }
}