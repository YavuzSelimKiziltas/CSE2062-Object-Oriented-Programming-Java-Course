import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius and length of a cylinder: ");
            
            double radius = scanner.nextDouble();
            double length = scanner.nextDouble();
            double pi = 3.14159;
            
            System.out.println(radius + " " + length);
            
            double area = radius * radius * pi;
            double volume = area * length;
            
            System.out.println("The area is " + area);
            System.out.println("The volume of the cylinder is " + volume);
        }
    }
}