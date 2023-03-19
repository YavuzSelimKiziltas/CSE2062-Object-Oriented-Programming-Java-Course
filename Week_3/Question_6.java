import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double e1, e2, e3;

        System.out.print("Enter three edges (length in double): ");
        e1 = scanner.nextDouble();
        e2 = scanner.nextDouble();
        e3 = scanner.nextDouble();
        System.out.println(e1 + " , " + e2 + " , " + e3);

        if(((e1+e2) < e3) || ((e1+e3) < e2) || ((e2+e3) < e2)){
            System.out.println("Input is invalid");
        }
        else{
            System.out.println("The perimeter is " + (e1 + e2 + e3));
        }

        scanner.close();
    }
    
}
