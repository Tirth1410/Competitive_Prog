import java.util.ArrayList;
import java.util.Scanner;
public class Garland{
    public static ArrayList<Integer> GiveAns(ArrayList<Integer> arr, int [] eve, int [] odd, ArrayList<Integer> idx) {
        int pTe=0, pTo=0;
        for (int i = 0; i < idx.size(); i++) {
            if(idx.get(i) == 0){
                if(arr.get(idx.get(i) + 1) % 2 == 0){
                    if(eve.length != 0){
                        arr.set(idx.get(i), eve[pTe]);
                        pTe++;
                    } else {
                        arr.set(idx.get(i), odd[pTo]);
                        pTo++;
                    }
                } else {
                    if(pTo < odd.length){
                        arr.set(idx.get(i), odd[pTo]);
                        pTo++;
                    } else {
                        arr.set(idx.get(i), eve[pTe]);
                        pTe++;
                    }
                }
            } else if(idx.get(i) == arr.size()-1){
                if(arr.get(idx.get(i) - 1) % 2 == 0){
                    if(eve.length != 0){
                        arr.set(idx.get(i), eve[pTe]);
                        pTe++;
                    } else {
                        arr.set(idx.get(i), odd[pTo]);
                        pTo++;
                    }
                } else {
                    if(pTo < odd.length){
                        arr.set(idx.get(i), odd[pTo]);
                        pTo++;
                    } else {
                        arr.set(idx.get(i), eve[pTe]);
                        pTe++;
                    }
                }
            } else {
                if(arr.get(idx.get(i) - 1) % 2 == 0){
                    if(pTe < eve.length){
                        arr.set(idx.get(i), eve[pTe]);
                        pTe++;
                    } else {
                        arr.set(idx.get(i), odd[pTo]);
                        pTo++;
                    }
                } else {
                    if(pTo < odd.length){
                        arr.set(idx.get(i), odd[pTo]);
                        pTo++;
                    } else {
                        arr.set(idx.get(i), eve[pTe]);
                        pTe++;
                    }
                }
            }
//            System.out.println(arr);
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> idx = new ArrayList<>();
        if(n == 1){
            int tem = sc.nextInt();
            System.out.println("0");
        } else {
            int eve = 0, odd = 0;
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
                if (arr.get(i) == 0) {
                    idx.add(i);
                } else {
                    if (arr.get(i) % 2 == 0) {
                        eve++;
                    } else {
                        odd++;
                    }
                }
            }
            int iE = 0, iO = 0;
            if (n % 2 == 0) {
                iE = (n / 2) - eve;
                iO = (n / 2) - odd;
            } else {
                iE = (n / 2) - eve;
                iO = (n / 2) + 1 - odd;
            }

            int[] EVEN = new int[iE];
            int[] ODd = new int[iO];
            int pTe = 0, pTo = 0;
            for (int i = 0; i < n; i++) {
                if (!arr.contains(i + 1)) {
                    if ((i + 1) % 2 == 0) {
                        EVEN[pTe] = i + 1;
                        pTe++;
                    } else {
                        ODd[pTo] = i + 1;
                        pTo++;
                    }
                }
            }
//        System.out.println(idx);
        System.out.println(arr);
            int comp = 0;
            ArrayList<Integer> ans = GiveAns(arr, EVEN, ODd, idx);
        System.out.println(ans);
            for (int i = 0; i < n - 1; i++) {
                if ((ans.get(i) % 2 != 0 && ans.get(i + 1) % 2 != 0) || (ans.get(i) % 2 == 0 && ans.get(i + 1) % 2 == 0)) {
//                comp++;
                } else {
                    comp++;
//                    i++;
                }
            }
            System.out.println(comp);
        }
    }
}