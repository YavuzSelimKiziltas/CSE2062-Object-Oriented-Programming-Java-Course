import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[7];
        double minNumber;

        System.out.print("Enter seven double numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
            System.out.print(numbers[i] + " ");
        }    

        minNumber = min(numbers);
        System.out.println("\nThe minimal value is " + minNumber);

        scanner.close();
    }

    public static double min(double[] array){
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }

        return min;

    }
}
