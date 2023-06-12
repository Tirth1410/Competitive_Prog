import java.util.Scanner;
public class Arec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextInt();
        long y1 = sc.nextInt();
        long x2 = sc.nextInt();
        long y2= sc.nextInt();

        long max = Math.max(Math.abs(x1-x2), Math.abs(y1-y2));
        long min = Math.min(Math.abs(x1-x2), Math.abs(y1-y2));

        long HexRow = (max/2) + 1;
        long HexCol = min;

        long Units = HexRow;

        if(HexCol % 2 == 0){
            Units += (HexRow*(HexCol/2)) + ((HexRow-1)*(HexCol/2));
        } else {
            Units += (HexRow*(HexCol/2)) + ((HexRow-1)*((HexCol/2)+1));
        }

        System.out.println(Units);
    }
}