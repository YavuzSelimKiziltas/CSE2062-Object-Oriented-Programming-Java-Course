import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String myString;

        System.out.print("Enter a string: ");
        myString = scanner.nextLine();
        System.out.println(myString);

        System.out.print("The reversed string is ");
        for (int i = myString.length() - 1; i >= 0 ; i--) {
            System.out.print(myString.charAt(i));
        }

        scanner.close();
    }
}
