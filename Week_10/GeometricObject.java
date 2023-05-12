public class GeometricObject {
    public static void main(String[] args) {
        
        shapeA circleShape = new Circle();

        circleShape.draw();

        /* Otherwise we cant call draw2 method from shapeA */
        ((shapeB) circleShape).draw2();
    }    
}

interface shapeA {

    public String baseClass = "Shape 1";

    /* Abstract method definition */
    public void draw();
}

/* Between the interfaces we use extends keyword */
interface shapeB extends shapeA{

    public String baseClass = "Shape 2";

    public void draw2();
}

class Circle implements shapeB {

    @Override
    public void draw() {
        System.out.println("Drawing circle here: " + shapeA.baseClass);
    }

    @Override
    public void draw2() {
        System.out.println("Drawing circle here from B: " + shapeB.baseClass);
    }

}

