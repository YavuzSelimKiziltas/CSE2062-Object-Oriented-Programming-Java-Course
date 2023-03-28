import java.util.Scanner;


public class Question_1 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in); 
        int number, reversedNumber;

        System.out.print("Enter a postive integer: ");
        number = scanner.nextInt();
        System.out.println(number);

        reversedNumber = reversed(number);

        if(isBoolean(reversedNumber, number)){
            System.out.println(number + " is a palindrome");
        }
        else {
            System.out.println(number + " is not a palindrome");
        }

        scanner.close();
    }


    public static int reversed(int number) {

        int result = 0, remainder;

        while(number > 0) {
            remainder = number % 10;
            result = result * 10 + remainder;
            number /= 10;
        } 
        return result;  
    }

    public static boolean isBoolean(int reversedNumber, int number) {
        
        return (reversedNumber == number) ? true : false;
    }
}
