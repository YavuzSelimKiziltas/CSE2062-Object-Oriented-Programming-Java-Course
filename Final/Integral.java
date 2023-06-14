import java.util.Scanner;
import java.util.ArrayList;

public class Integral {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<Double> inputList = new ArrayList<>();
    
    while(scanner.hasNextDouble()) {
        inputList.add(scanner.nextDouble());
    }
    
    integrate(inputList).forEach(number -> {
        System.out.print(number+" ");
    });

    scanner.close();    
  }

    public static ArrayList<Double> integrate(ArrayList<Double> poly){
    	ArrayList<Double> intg = new ArrayList<>();
    	intg.add(sum(poly));
    	for(int i=1;i<poly.size()+1;i++){
    		intg.add(poly.get(i-1)/i);
    	}
    	return intg;
    }
    
    public static double sum(ArrayList<Double> list) {
        double sum = 0; 
        for (double i : list)
            sum = sum + i;
        return sum;
    }
}