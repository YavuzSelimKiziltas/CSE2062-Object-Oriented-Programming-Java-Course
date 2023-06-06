import java.util.Scanner;

public class Exercise5_45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfStudents = 10;

        double[] students = new double[10];
        double sum = 0;
        double deviation = 0, mean;

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = scanner.nextDouble();
            sum += students[i]; 
            deviation += Math.pow(students[i], 2);
        }
        System.out.println();

        mean = sum / numberOfStudents;
        deviation -= (Math.pow(sum, 2)/numberOfStudents);
        deviation = Math.sqrt(deviation/(numberOfStudents - 1));

        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %.5f", deviation);

        scanner.close();
    }
}
