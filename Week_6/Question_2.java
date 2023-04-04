public class Question_2 {
  public static void main(String[] args) {
    
    Rectangle myRectangle1 = new Rectangle(4, 40);
    Rectangle myRectangle2 = new Rectangle(3.5, 35.9);
  
    System.out.println("Width of Rectangle 1: " + myRectangle1.width);
    System.out.println("Height of Rectangle 1: " + myRectangle1.height);
    System.out.println("Area of Rectangle 1: " + myRectangle1.getArea());
    System.out.println("Perimeter of Rectangle 1: " + myRectangle1.getPerimeter());

    System.out.println();

    System.out.println("Width of Rectangle 2: " + myRectangle2.width);
    System.out.println("Height of Rectangle 2: " + myRectangle2.height);
    System.out.println("Area of Rectangle 2: " + myRectangle2.getArea());
    System.out.println("Perimeter of Rectangle 2: " + myRectangle2.getPerimeter());

  }  
}

