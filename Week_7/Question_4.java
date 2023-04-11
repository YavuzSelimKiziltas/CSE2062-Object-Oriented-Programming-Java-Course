public class Question_4 {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));
    
        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));
    
        String s = "3539";
        System.out.println(MyInteger.parseInt(s));
        
        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
      }
}

class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /* isEven Method Overloadings */
    public boolean isEven() {
        return isEven(value);
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static boolean isEven(MyInteger n) {
        return isEven(n.getValue());
    }
  
    /* isOdd Method Overloadings */
    public boolean isOdd() {
        return isOdd(value); 
    }
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
    public static boolean isOdd(MyInteger n) {
        return isOdd(n.getValue());
    }

    /* isPrime Overloadings */
    public boolean isPrime() {
        return isPrime(value);
    }
    public static boolean isPrime(int num) {
        if(num == 1 || num == 2){
            return true;
        }

        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPrime(MyInteger num) {
        return isPrime(num.getValue());
    }

    public boolean equals(int number) {
        return (number == value);
    }

    public boolean equals(MyInteger number) {
        return (number.getValue() == value);
    }

    public static int parseInt(char[] numbers) {
      /* numbers consists of digit characters.
       For example, if numbers is {'1', '2', '5'}, the return value
       should be 125. Please note that
       numbers[0] is '1'
       numbers[1] is '2'
       numbers[2] is '5'
      */
        int parsedNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            parsedNumber *= 10;
            parsedNumber += (numbers[i] - '0');    // If you dont use  - '0' part then it sums it up with ascii value.
        }

      return parsedNumber;
    }

    public static int parseInt(String s) {
        // s consists of digit characters.
        // For example, if s is "125", the return value
        //  should be 125.
        int parsedNumber = 0;
        for (int i = 0; i < s.length(); i++) {
            parsedNumber *= 10;
            parsedNumber += (s.charAt(i) - '0');    // If you dont use  - '0' part then it sums it up with ascii value.
        }
    
        return parsedNumber;
      }
  
}





