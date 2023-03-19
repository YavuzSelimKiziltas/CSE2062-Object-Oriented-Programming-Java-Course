import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int today, elapsedDay, futureDay;

        System.out.print("Enter today’s day: ");
        today = scanner.nextInt();
        System.out.println(today);
        
        System.out.print("Enter the number of days elapsed since today: ");
        elapsedDay = scanner.nextInt();
        System.out.println(elapsedDay);


        if (today >= 0 && today <= 6) {
            System.out.print("Today is " + daysOfWeek[today] + " and the future day is ");
        } else {
            System.out.println("Invalid day");
        }
        
        futureDay = (today + elapsedDay) % 7;
        
        if (futureDay >= 0 && futureDay <= 6) {
            System.out.print(daysOfWeek[futureDay]);
        } else {
            System.out.println("Invalid day");
        }       

        scanner.close();
    }
}
