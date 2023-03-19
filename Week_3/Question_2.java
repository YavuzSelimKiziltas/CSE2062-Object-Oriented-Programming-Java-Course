import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /* These are like #define macro in C but with some differences */
        final double POUNDS_TO_KG = 0.45359237;
        final double INCH_TO_METER = 0.0254;

        double weight, height;
        double bmi;
        
        System.out.print("Enter weight in pounds: ");
        weight = scanner.nextDouble();
        System.out.println(weight);

        System.out.print("Enter height in inches: ");
        height = scanner.nextDouble();
        System.out.println(height);

        weight *= POUNDS_TO_KG;
        height *= INCH_TO_METER; 
        
        bmi = weight / (height * height);
        System.out.println("BMI is " + bmi);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi < 25){
            System.out.println("Normal");
        }
        else if(bmi >= 25 && bmi < 30){
            System.out.println("Overweight");
        }
        else if(bmi >= 30){
            System.out.println("Obese");
        }

        scanner.close();
    }
}
