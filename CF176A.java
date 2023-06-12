import java.util.Scanner;
public class CF176A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] grid = new String [4];
        for (int i = 0; i < 4; i++) {
            grid[i] = sc.next();
        }

        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int count = 0;
                if(grid[i].charAt(j) == '#'){
                    count++;
                }
                if(grid[i].charAt(j+1) == '#'){
                    count++;
                }
                if(grid[i+1].charAt(j) == '#'){
                    count++;
                }
                if(grid[i+1].charAt(j+1) == '#'){
                    count++;
                }

                if(count == 1 || count == 0 || count == 3 || count == 4){
                    flag = true;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}