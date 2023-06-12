import java.util.Arrays;
import java.util.Scanner;
public class MakeBeauty{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int [n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int arr1[] = new int [n];

            Arrays.sort(arr);

            if(arr[0] == arr[arr.length-1]){
                System.out.println("NO");
            } else {
                int e=arr.length-1, s=0;
                for (int i = 0; i < n; i++) {
                    if(i % 2 == 0){
                        arr1[i]=arr[s];
                        s++;
                    } else {
                        arr1[i]=arr[e];
                        e--;
                    }
                }
                for (int i = 0; i < n-2; i++) {
                    if((arr1[i] == arr1[i+1]) || arr1[i] + arr1[i+1] == arr1[i+2]){
                        System.out.println("NO");
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}