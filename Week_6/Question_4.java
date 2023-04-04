public class Question_4 {
    public static void main(String[] args) {
        
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOnOff(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOnOff(false);
        System.out.println(fan2.toString());
    }
    
}
