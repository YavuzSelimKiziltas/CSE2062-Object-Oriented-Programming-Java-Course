import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the number of minutes: ");
            long numberOfMinutes = scanner.nextLong();

            long numberOfYears;
            long numberOfDays;

            numberOfDays = numberOfMinutes / (60 * 24);
            numberOfYears = numberOfDays / 365;
            numberOfDays = numberOfDays % 365;
            
            System.out.println(numberOfMinutes + " minutes is approximately " + numberOfYears + " years and " + numberOfDays + " days");
        }
    }
}
