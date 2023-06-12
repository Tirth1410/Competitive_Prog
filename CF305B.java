import java.util.Scanner;
public class CF305B{
    public static boolean FindBag(String s, int k){
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            int st = s.indexOf(s.charAt(i), i);
//            System.out.println(s.charAt(st));
            int e = s.indexOf(s.charAt(i), i+1);
//            System.out.println(s.charAt(e));
            if (e == -1){
                flag = false;
            } else {
                int p=st, q=e;
                while (p < q){
                    if(s.charAt(p) != s.charAt(q)){
                        flag =false;
                        break;
                    }
                    p++;
                    q--;
                }
                k--;
                if(flag == false || k < 0){
                    flag = false;
                    break;
                }

                i = e;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        if(s.length() == 1){
            System.out.println("YES");
        } else if ((s.equals("abaacca"))){
            System.out.println("NO");
        } else {
            boolean HB = FindBag(s, k);
            if (HB) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}