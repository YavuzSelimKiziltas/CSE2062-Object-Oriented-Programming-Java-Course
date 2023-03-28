import java.util.Scanner;
import java.lang.Math;

public class Question_1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double r, s, area;

        System.out.print("Enter the length from the center to a vertex: ");
        r = scanner.nextDouble();
        System.out.println(r);

        s = 2 * r * Math.sin(Math.PI / 5);
        
        area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        /* Displays two digits after comma */
        System.out.println("The area of the pentagon is " + Math.round(area * 100) / 100.0);

        scanner.close();
        
    }   
}
