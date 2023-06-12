import java.util.Scanner;
public class demo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] a = new String[8];

        int t = sc.nextInt();
        int c;
        int d;
        int e;
        int f;
        int up = 0;
        int mid = 0;
        int down = 0;
        int pos = 0;

        for(int i = 0;i<t;i++){


            for(int b = 0;b<8;b++){
                a[b] = sc.next();
            }

            for( c = 0;c<6;c++){
                up = 0;
                mid = 0;
                down = 0;
                for( d =0;d<8;d++){
                    if(a[c].charAt(d)=='#'){
                        up++;
                    }
                }

                for(e=0;e<8;e++) {

                    if (a[c+1].charAt(e) == '#') {
                        mid++;
                        pos = e;
                    }
                }

                for(f = 0;f<8;f++) {

                    if (a[c+2].charAt(f) == '#') {
                        down++;
                    }
                }
                if(up==2 && mid ==1 && down==2){

                    System.out.println((c+2)+" "+(pos+1));
                    break;
                }

            }
        }

    }
}