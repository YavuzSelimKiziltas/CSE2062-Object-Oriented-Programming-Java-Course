import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = 0, num2 = 0;
        boolean check = true;
        System.out.print("Enter two integers: ");

        while(check) {

            try {
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                check = false;  
                
            } catch (Exception e) {
                e.printStackTrace();
                System.out.print("Re-enter two integer inputs: ");
                scanner.nextLine(); // Discards the wrong inputs
            }

        }

        System.out.println("Sum is " + (num1 + num2));
     
        scanner.close();
    }
}
