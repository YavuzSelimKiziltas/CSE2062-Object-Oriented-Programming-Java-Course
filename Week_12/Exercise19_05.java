import java.util.Scanner;

public class Exercise19_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = new Integer[10];

        System.out.print("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The max number is: " + max(numbers));

        scanner.close();
    }

    public static<E extends Comparable<E>> E max(E[] list) {
        E max = list[0];

        for (int i = 0; i < list.length; i++) {
            if(max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }

        return max;
    }
}
