import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.print("Enter a string for password: ");
        password = scanner.nextLine();
        System.out.println(password);

        if(isValid(password)){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
        }

        scanner.close();
    }

    public static boolean isValid(String password) {

        int numberOfDigits = 0, numberOfLetters = 0;

        for (int i = 0; i < password.length(); i++) {
            Character ch = password.charAt(i);

            if(Character.isLetter(ch)){
                numberOfLetters++;
            }
            else if(Character.isDigit(ch)){
                numberOfDigits++;
            }
            /* Checks if the password contains other than letter and digit */
            else{
                return false;
            }
        }

        /* Checks the length condition */
        if((numberOfDigits +numberOfLetters) < 8) {
            return  false;
        }
        /* Checks the number of digits  */
        else if(numberOfDigits < 2){
            return false;
        }
        else{
            return true;
        }

    }
}
