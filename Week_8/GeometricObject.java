public class GeometricObject {
    private String color = "blue";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /* This method assumes it is a rectangle but in Triangle class, it will be overwritten */
    public double getArea(double s1, double s2) {
        return s1 * s2;
    }

    public String toString() {
        return "Created on: " + dateCreated + "\nColor: " + color + " and filled status: " + filled;
    }
}
