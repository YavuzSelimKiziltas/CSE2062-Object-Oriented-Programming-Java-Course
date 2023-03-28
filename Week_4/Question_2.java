import java.util.Scanner;

public class Question_2 {
   public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        char ch, upperCased;
        System.out.print("Enter a letter: ");
        ch = scanner.nextLine().charAt(0);
        System.out.println(ch);

        upperCased = Character.toUpperCase(ch);

        if(!Character.isLetter(ch)){
         System.out.println(ch + " is an invalid input");
        }
        else if(upperCased == 'A' || upperCased == 'E' || upperCased == 'I' || upperCased == 'O' || upperCased == 'U'){
            System.out.println(ch + " is a vowel");
        }
        else{
            System.out.println(ch + " is a consonant");
        }
        

        scanner.close();
   } 
}
