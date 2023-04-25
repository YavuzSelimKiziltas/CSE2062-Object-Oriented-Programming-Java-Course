public class Question_2 {
    public static void main(String[ ] args) {
      int[] myNumbers = {1, 2, 3};
      
      try {
          System.out.println(myNumbers[10]); // error!
      }
      
      /* We can just give general Exception type rather than Specific Exception type */
      catch(Exception e) {
        System.out.println("Something went wrong.");
      }
      
    }
  }