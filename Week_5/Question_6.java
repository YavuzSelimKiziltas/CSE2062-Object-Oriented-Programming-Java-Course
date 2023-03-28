import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3 by 4 matrix row by row:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextDouble();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < matrix[0].length; j++) {
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn(matrix, j));
        }

        scanner.close();
    }
 
    public static double sumColumn(double[][] m, int columnIndex) {

        double sum = 0;
        
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }

        return sum;
    }
   
}
