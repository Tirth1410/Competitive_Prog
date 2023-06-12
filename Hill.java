import java.util.ArrayList;
import java.util.Scanner;
public class Hill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ele = sc.nextInt();
            list.add(ele);
        }

        for (int i = 0; i < q; i++) {
            int req = sc.nextInt();

            if(list.contains(req)){
                System.out.println(list.indexOf(req) + " " + list.indexOf(req));
            } else {
                int sum = list.get(list.size()-1);
                int pt1 = list.size()-1;
                while (sum != req){
//                    sum = list.get(pt2) + list.get(pt1);
                    if (sum > req){
                        pt1--;
                        sum = list.get(pt1);
                    } else if(sum < req){

                        int pt = pt1-1;
                        int k = pt;

                        sum += list.get(k);
                        while (sum < req){
                            k--;
                            sum += list.get(k);
                        }

                        if (sum != req){
                            pt1--;
                            sum = list.get(pt1);
                            continue;
                        } else {
                            int idx1 = k;
                            int idx2 = pt1;

                            if(list.get(k) == list.get(pt1)){
                                while (list.get(k) == list.get(pt1) && k > 0){
                                    k--;
                                    pt1--;
                                    if (list.get(k) == list.get(pt1)){
                                        idx1 = k;
                                        idx2 = pt1;
                                    } else {
                                        break;
                                    }
                                }
                            }
                            System.out.println((idx1) + " " + idx2);
                        }
                    }
                }
            }
        }
    }
}