import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int choice;
        int random;
        
        /* java.lang.Math.random() returns a double between 0.0 and 1.0 */
        random = (int) (java.lang.Math.random() * 10) % 3;

        System.out.print("scissor (0), rock (1), paper (2): ");
        choice = scanner.nextInt();
        System.out.println(choice);

        switch(random){

            case 0:
            if(choice == 0) {System.out.println("The computer is scissor. You are scissor. You draw");}
            else if(choice == 1) {System.out.println("The computer is scissor. You are rock. You win");}
            else {System.out.println("The computer is scissor. You are paper. You lost");}
            break;

            case 1:
            if(choice == 0) {System.out.println("The computer is rock. You are scissor. You lost");}
            else if(choice == 1) {System.out.println("The computer is rock. You are rock. You draw");}
            else {System.out.println("The computer is rock. You are paper. You win");}
            break;

            case 2:
            if(choice == 0) {System.out.println("The computer is paper. You are scissor. You win");}
            else if(choice == 1) {System.out.println("The computer is paper. You are rock. You lost");}
            else {System.out.println("The computer is paper. You are paper. You draw");}
            break;

        }

        scanner.close();
    }

}