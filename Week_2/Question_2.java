import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int subtotal = scanner.nextInt();
            int rate = scanner.nextInt();
            System.out.println("Enter subtotal and gratuity rate: " + subtotal + " " + rate);
            
            double gratuity = subtotal * rate / 100.0;
            double total = gratuity + subtotal;
            
            System.out.println("The gratuity is $" + gratuity + " total is $" + total);
        }
    }
}
