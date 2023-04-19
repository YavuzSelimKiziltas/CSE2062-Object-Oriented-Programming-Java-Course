import java.util.ArrayList;
import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new  ArrayList<Integer>();
        
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt());
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); 
        
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        scanner.close();
    }
    
    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(!(temp.contains(list.get(i)))){
                temp.add(list.get(i));
            }
        }

        list.clear();
        for(int i = 0; i < temp.size(); i++) {
            list.add(temp.get(i));
        }
        
    }
}
