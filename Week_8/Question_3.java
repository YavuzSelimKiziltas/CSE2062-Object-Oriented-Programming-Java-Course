import java.util.Scanner;
import java.util.ArrayList;

public class Question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter five integers for list1: ");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        System.out.print("Enter five integers for list2: ");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list2.add(scanner.nextInt());
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
     
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3 = union(list1, list2);
        System.out.print("The combined list is ");
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }

        scanner.close();
    }

    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2){
        
        ArrayList<Integer> unionList = new ArrayList<Integer>();

        for (int i = 0; i < l1.size(); i++) {
            unionList.add(l1.get(i));
        }
        for (int i = 0; i < l2.size(); i++) {
            unionList.add(l2.get(i));
        }

        return unionList;
    }
}
