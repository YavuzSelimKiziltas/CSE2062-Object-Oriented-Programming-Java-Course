import java.util.Scanner;

public class Question_3 {

    public static void checkAge(int age) {
        
        if(age < 18) {
            throw new ArithmeticException("Application denied - You must be at least 18 years old.");
        }

        else{
            System.out.println("Application granted - You are old enough!");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        checkAge(age);

        scanner.close();
    }
}
