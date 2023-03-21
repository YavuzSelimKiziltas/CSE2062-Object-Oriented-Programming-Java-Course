import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n1, n2, d;

        System.out.print("Enter the first number: ");
        n1 = scanner.nextInt();
        System.out.println(n1);

        System.out.print("Enter the second number: ");
        n2 = scanner.nextInt();
        System.out.println(n2);

        d = (n1>n2) ? n2 : n1;
        
        while(d > 0 ){
            
            if((n1%d == 0) && (n2%d == 0)){
                System.out.println("GCD of " + n1 + " and " + n2 + " is " + d);
                break;
            }

            d--;
        }

        scanner.close();
    }
}
