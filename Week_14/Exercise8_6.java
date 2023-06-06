import java.util.Scanner;

public class Exercise8_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = 3;

        double[][] a = new double[N][N];
        double[][] b = new double[N][N];
        double[][] result = new double[N][N];

        System.out.print("Enter matrix 1: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = scanner.nextDouble();
            }
        }
        System.out.println();

        System.out.print("Enter matrix 2: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                b[i][j] = scanner.nextDouble();
            }
        }
        System.out.println();

        result = multiplyMatrix(a, b);

        System.out.println("The multipication of the matrices is");
        printResult(a, b, result, '*');
        
        scanner.close();
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {

        double[][] c = new double[a.length][b[0].length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        return c;
    }

    /** Print result */
    public static void printResult(double[][] m1, double[][] m2, double[][] m3, char op) {
        for (int i = 0; i < m1.length; i++) {
          for (int j = 0; j < m1[0].length; j++)
            System.out.print(" " + m1[i][j]);
      
          if (i == m1.length / 2)
            System.out.print( "  " + op + "  " );
          else
            System.out.print( "     " );
      
          for (int j = 0; j < m2[0].length; j++)
            System.out.print(" " + m2[i][j]);
      
          if (i == m1.length / 2)
            System.out.print( "  =  " );
          else
            System.out.print( "     " );
      
          for (int j = 0; j < m3[0].length; j++)
            System.out.print(" " + Math.round(m3[i][j] * 10) / 10.0);
      
          System.out.println();
        }
      }
}



    
      