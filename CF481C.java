import java.util.Scanner;
public class CF481C{
    public static long [] predict(long letter, long [] sumdor){

        int s=0, e=sumdor.length-1;

        long ans [] = new long[2];
        while (s <= e){
            int mid = s + ((e-s)/2);
            if(letter <= sumdor[mid]){
                e = mid-1;
                ans[0] = mid+1;
                if(mid == 0){
                    ans[1] = letter;
                } else {
                    ans[1] = letter - sumdor[mid-1];
                }
            } else {
                s = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long dor [] = new long [n];
        long sumdor [] = new long [n];
        long sum=0;
        long letter [] = new long [m];
        for (int i = 0; i < n; i++) {
            dor[i] = sc.nextLong();
            sumdor[i] = sum + dor[i];
            sum = sumdor[i];
        }

        for (int i = 0; i < m; i++) {
            letter[i] = sc.nextLong();

            long ans [] = predict(letter[i],sumdor);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}