import java.util.Scanner;
public class Bishop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            String [] pos = new String [8];

            for(int i=0; i<8; i++){
                pos[i] = sc.next();
            }

            int r=0, c=0;

            for(int i=0; i<6; i++){
                int count1 = 0;
                int count2 = 0;
                int count3 = 0;
                int posi = 0;
                for(int j=0; j<8; j++){
                    if(pos[i].charAt(j) == '#'){
                        count1++;
                    }

                    if(pos[i+1].charAt(j) == '#'){
                        count2++;
                        posi = j;
                    }

                    if(pos[i+2].charAt(j) == '#'){
                        count3++;
                    }

                    if(count1 == 2 && count2 == 1 && count3 == 2){
                        System.out.println(i+2 + " " + (posi+1));
                        break;
                    }
                }

            }
        }
    }
}