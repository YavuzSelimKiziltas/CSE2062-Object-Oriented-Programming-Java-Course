import java.util.ArrayList;
import java.util.Scanner;

public class MidtermRemoveDuplicate {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listOfStrings = new ArrayList<>();
        String line = "";

        do {
         
            line = scanner.nextLine();
            if(!listOfStrings.contains(line) && (!line.equals("$end$"))){
                listOfStrings.add(line);
            }

            if(line == "$end$\n"){
                System.out.println("out of the loop");
            }
            
        } while (!line.equals("$end$"));

        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(listOfStrings.get(i));
        }

        scanner.close();
    }
}
