import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            double mass, energy, initialTemp, finalTemp;

            System.out.print("Enter the amount of water in kilograms: ");
            mass = scanner.nextDouble();

            System.out.print("Enter the initial temperature: ");
            initialTemp = scanner.nextDouble();

            System.out.print("Enter the final temperature: ");
            finalTemp = scanner.nextDouble();

            energy = mass * (finalTemp - initialTemp) * 4184;
            System.out.println("The energy needed is " + energy);

        }
    }
}
