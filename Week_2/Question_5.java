import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int originalNumber, number, sum = 0;

            System.out.print("Enter an integer between 0 and 1000: ");
            originalNumber = scanner.nextInt();
            number = originalNumber;

            while(number > 0){
                sum += number % 10;
                number /= 10;
            }

            System.out.println("The sum of all digits in " + originalNumber +  " is " +  sum);

        }
    }
}
