import java.util.ArrayList;
import java.util.Scanner;
public class Hero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int [n];
        int max = 0, strength = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
            } else if(arr[i] != 0){
                list.add(arr[i]);
            }

            if(arr[i] == 0){
                strength+= max;
                max = 0;
            }
        }
        System.out.println(strength);
    }
}