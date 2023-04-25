public class Question_1 {
    public static void main(String[] args) throws Exception {
        
        try {
            // code that generate exception
            int divideByZero = 5 / 0;            
          }
          
          catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
          }

    }
}
