import java.util.Scanner;
import java.lang.Math;

public class MidtermExponentialCalculation {
  public static void main(String[] args) {
    double x, error; 
    Scanner scanner = new Scanner(System.in);
    x = scanner.nextDouble();
    error = scanner.nextDouble();
    System.out.printf("Result: %.4f", myExp(x, error));
    
  }

public static double myExp(double x, double error){
		double sum=1;
		int fact=1,c=1;
		double term=Math.pow(x,c)/fact;
		while(term>error){
			sum+=term;
			fact*=++c;
			term=Math.pow(x,c)/fact;
		}
		System.out.println("Number of terms: " + c);
		System.out.printf("Expected Value: %.4f\n", Math.exp(x));
		return sum;
	}
}