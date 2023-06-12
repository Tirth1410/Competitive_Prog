/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AverageFlex
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<n; i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            int sum=0;
            ArrayList<Integer> freq = new ArrayList<>();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(!list.contains(arr.get(i))){
                    sum += Collections.frequency(arr, arr.get(i));
                    freq.add(sum);
                    list.add(arr.get(i));
                } else{
                    freq.add(sum);
                }
            }

            int s=0, e=n-1;
            int ans=0;
//            System.out.println(freq);
            while(s <= e){
                int mid = (s+e)/2;
                int lim = n/2;
                if(n % 2 != 0){
                    lim++;
                }
                if(freq.get(mid) >= lim){
                    ans = n-mid;
                    e = mid-1;
                } else {
                    s = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }
}
