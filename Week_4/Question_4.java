import java.util.Scanner;

public class Question_4 {
   public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int num, numberOfPositive = 0, sum = 0,  numberOfNegative = 0;
        double average = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        do {

            num = scanner.nextInt();
            sum += num;

            if(num > 0){
                numberOfPositive++;
            }
            else if(num < 0){
                numberOfNegative++;
            }
            
            System.out.print(num + " ");

        } while (num != 0);

        System.out.println();

        average = (double) sum / (numberOfPositive + numberOfNegative);
        
        System.out.println("The number of positives is " + numberOfPositive);
        System.out.println("The number of negatives is " + numberOfNegative);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + average);

        scanner.close();
   } 
}
