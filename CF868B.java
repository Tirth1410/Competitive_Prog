import java.util.ArrayList;
import java.util.Scanner;
public class CF868B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();{
            while (t-- > 0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int [] arr = new int [n];
                int count = 0;
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    if(Math.abs(arr[i] - (i + 1)) % k == 0){
                        continue;
                    } else {
                        count++;
                    }

                    if(count <= 2){
                        list.add(i+1);
                    }
                }

                if(count == 0){
                    System.out.println("0");
                } else if(count > 2){
                    System.out.println("-1");
                } else {
                    int i1 = list.get(0);
                    int i2 = list.get(1);

                    if (Math.abs(arr[i1-1] - (i2)) % k == 0 && Math.abs(arr[i2-1] - (i1)) % k == 0){
                        System.out.println("1");
                    } else {
                        System.out.println("-1");
                    }
                }
            }
        }
    }
}