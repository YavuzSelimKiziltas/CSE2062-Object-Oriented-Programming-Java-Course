import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String city1, city2, city3, temp;

        System.out.print("Enter the first city: ");
        city1 = scanner.nextLine();
        System.out.println(city1);
        
        System.out.print("Enter the second city: ");
        city2 = scanner.nextLine();
        System.out.println(city2);

        System.out.print("Enter the third city: ");
        city3 = scanner.nextLine();
        System.out.println(city3);

        if(city1.compareTo(city2) > 0){
            temp = city1;
            city1 = city2;
            city2 = temp;            
        }

        if(city1.compareTo(city3) > 0){
            temp = city1;
            city1 = city3;
            city3 = temp;            
        }

        if(city2.compareTo(city3) > 0){
            temp = city2;
            city2 = city3;
            city3 = temp;            
        }
        
        System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);

        scanner.close();
    }
}
