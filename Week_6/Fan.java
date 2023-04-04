/* Fan Class for Question_4 */
public class Fan {
    
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public boolean isOn() {
        return on;
    }
    public void setOnOff(boolean newState) {
        on = newState;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        color = newColor;
    }

    Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "Blue";
    }

    public String toString() {

        String combinedString = "";

        if(on) {
            combinedString += "speed: " + speed + "\n" +
                              "color: " + color + "\n" +
                              "radius: " + radius;
        }
        else {
            combinedString += "color: " + color + "\n" +
                              "radius: " + radius + "\n" +
                              "fan is off";               
        }

        return combinedString;
    }

}
