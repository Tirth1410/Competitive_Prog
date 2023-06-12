import java.util.Scanner;
public class Polyhedron{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int faces = 0;
        while(n-- > 0) {
            String polyhedron = sc.next();
            if(polyhedron.equals("Tetrahedron")){
                faces += 4;
            } else if(polyhedron.equals("Cube")){
                faces += 6;
            } else if(polyhedron.equals("Octahedron")){
                faces += 8;
            } else if(polyhedron.equals("Dodecahedron")){
                faces += 12;
            } else if(polyhedron.equals("Icosahedron")){
                faces += 20;
            }
        }

        System.out.println(faces);
    }
}