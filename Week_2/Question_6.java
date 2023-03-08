import java.util.Scanner;
import java.lang.Math;

public class Question_6 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            double futureValue, annualIntrestRate, investmentAmount, monthlyRate;
            int numberOfYears;

            System.out.print("Enter the investment amount: ");
            investmentAmount = scanner.nextDouble();
            System.out.print(investmentAmount + "\n");

            System.out.print("Enter annual interest rate: ");
            annualIntrestRate = scanner.nextDouble();
            System.out.print(annualIntrestRate + "\n");

            monthlyRate = annualIntrestRate / (1200);
            
            System.out.print("Enter number of years as an integer: ");
            numberOfYears = scanner.nextInt();
            System.out.print(numberOfYears + "\n");

            futureValue = investmentAmount * Math.pow((1 + monthlyRate), (numberOfYears *12));
            System.out.print("Future value is $" + (int)(futureValue * 100) / 100.0); // To display two digits after the comma

        }

    }
}
