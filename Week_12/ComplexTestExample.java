import java.util.Scanner;

public class ComplexTestExample {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the first complex number: ");
  double a = scanner.nextDouble();
  double b = scanner.nextDouble();
  Complex c1 = new Complex(a, b);

  System.out.print("Enter the second complex number: ");
  double c = scanner.nextDouble();
  double d = scanner.nextDouble();
  Complex c2 = new Complex(c, d);

  System.out.println("(" + c1 + ")" + " + " + "(" + c2 + ")" + " = " + c1.add(c2));
  System.out.println("(" + c1 + ")" + " - " + "(" + c2 + ")" + " = " + c1.subtract(c2));
  System.out.println("(" + c1 + ")" + " * " + "(" + c2 + ")" + " = " + c1.multiply(c2));
  System.out.println("(" + c1 + ")" + " / " + "(" + c2 + ")" + " = " + c1.divide(c2));
  System.out.println("|" + c1 + "| = " + c1.abs());
  
  Complex c3 = (Complex)c1.clone();
  System.out.println(c1 == c3);
  System.out.println(c3.getRealPart());
  System.out.println(c3.getImaginaryPart());
  Complex c4 = new Complex(4, -0.5);
  Complex[] list = {c1, c2, c3, c4};
  java.util.Arrays.sort(list);
  System.out.println(java.util.Arrays.toString(list));

  scanner.close();
}
}


// BEGIN REVEL SUBMISSION
class Complex implements Cloneable, Comparable<Complex> {
  private double a;
  private double b;

  public Complex() {
    a = 0;
    b = 0;
  }

  public Complex(double a) {
    this.a = a;
    b = 0;
  }

  public Complex(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getRealPart() {
    return a;
  }

  public double getImaginaryPart() {
    return b;
  }

  /* (a + bi) + (c + di) = (a+c) + (b+d)i */
  public Complex add(Complex C) {
    double real = a + C.getRealPart();
    double imag = b + C.getImaginaryPart();

    Complex result = new Complex(real, imag);
    return result;
  }

  /* (a + bi) - (c + di) = (a-c) + (b-d)i */
  public Complex subtract(Complex c) {
    double real = a - c.getRealPart();
    double imag = b - c.getImaginaryPart();

    Complex result = new Complex(real, imag);
    return result;
  }

  /* (a + bi) * (c + di) = (ac - bd) + (bc + ad)i */
  public Complex multiply(Complex c) {
    double real = (a * c.getRealPart()) - (b * c.getImaginaryPart());
    double imag = (b * c.getRealPart()) + (a * c.getImaginaryPart());

    Complex result = new Complex(real, imag);
    return result;
  }

  /* (a + bi) / (c + di) = (ac + bd)/(c^2 + d^2) + (bc - ad)i/(c^2 + d^2) */
  public Complex divide(Complex c) {
    double real = ((a * c.getRealPart()) + (b * c.getImaginaryPart())) / (Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2));
    double imag = ((b * c.getRealPart()) - (a * c.getImaginaryPart())) / (Math.pow(c.getRealPart(), 2) + Math.pow(c.getImaginaryPart(), 2));

    Complex result = new Complex(real, imag);
    return result;
  }

  public double abs() {
    return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
  }

  public Object clone() {
    try {
      return super.clone();
    } catch (Exception e) {
      return null;
    }
  }

  @Override
  public int compareTo(Complex c) {
    double thisAbs = this.abs();
    double otherAbs = c.abs();

    if (thisAbs < otherAbs) {
      return -1;
    } else if (thisAbs > otherAbs) {
      return 1;
    } else {
      return 0;
    }
  }

  @Override
  public String toString() {
    if (b != 0)
      return a + " + " + b + "i";
    else
      return a + " ";
  }
}
// END REVEL SUBMISSION


