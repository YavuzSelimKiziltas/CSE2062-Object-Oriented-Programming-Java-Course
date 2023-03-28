import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents;
        double bestGrade = 0;

        System.out.print("Enter number of students: ");
        numberOfStudents = scanner.nextInt();
        System.out.println(numberOfStudents);

        double[] scores = new double[numberOfStudents];

        System.out.print("Enter " + numberOfStudents + " scores: ");

        for (int i = 0; i < scores.length; i++) {
           scores[i] = scanner.nextDouble();
           System.out.print(scores[i] + " ");
           
           if(scores[i] > bestGrade){
            bestGrade = scores[i];
           }
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.print("\nStudent " +  i + " score is " + scores[i] + " and grade is " );
            
            if(scores[i] >= bestGrade -10){
                System.out.println("A");
            }  
            else if(scores[i] >= bestGrade - 20) {
                System.out.println("B");
            }
            else if(scores[i] >= bestGrade - 30) {
                System.out.println("C");
            }
            else if(scores[i] >= bestGrade - 40) {
                System.out.println("D");
            }
            else {
                System.out.println("F");
            }
        }

        scanner.close();
    }
}
