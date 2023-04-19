import java.util.Scanner;

/*
 * class Child_Class extends Parent_Class {}
 */

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three sides of the Triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        Triangle tr1 = new Triangle(side1, side2, side3);

        System.out.println("Enter the color of the Triangle");
        String color = scanner.next();
        tr1.setColor(color);
        
        System.out.println("Enter a boolean status for filled");
        boolean filled = scanner.nextBoolean();
        tr1.setFilled(filled);

        /* tr1 will automatically retrun the tr1.toString() method output */
        System.out.println("\nThe area is: " + tr1.getArea() + "\nThe perimeter is: " + tr1.getPerimeter() + "\n" + tr1);

        scanner.close();
    }
}
