public class Question_5 {
    public static void main(String[] args) {
        
        try {
            int arr[] = new int[5];
            arr[5] = 90/0;
            
        } 
        
        catch (ArithmeticException e1) {
            System.out.println("Arithmetic Exception is catched");
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBoundsException is catched");
        }
        catch (Exception e3) {
            System.out.println("General Exception is catched");
        }

        /* Even though we have errors in code we can still continue*/
        System.out.println("Rest of the Code");

    }
}
