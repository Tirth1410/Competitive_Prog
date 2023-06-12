import java.util.Scanner;
public class Permu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            for(int i=1; i<=n; i++){
                if(i != n){
                    System.out.print(i+1 + " ");
                } else {
                    System.out.print("1");
                }
            }
        }
    }
}