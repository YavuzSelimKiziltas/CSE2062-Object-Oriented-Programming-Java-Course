import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number, firstDigit, lastDigit,temp;

        System.out.print("Enter a three-digit integer: ");
        number = scanner.nextInt();
        System.out.println(number);

        temp = number;
        
        if(number > 99 && number < 1000){
            firstDigit = number % 10;
            lastDigit= temp / 100;

            if(firstDigit == lastDigit){
                System.out.println(number +" is a palindrome");
            }
            else{
                System.out.println(number +" is not a palindrome");
            }
        }
        else{
            System.out.println("Invalid Entry");
        }

        scanner.close();
    } 
    
}
