//public class TryCatchExample {
//    public static void main(String[] args) {
//        try {
//            int result = 10 / 0;  // This will throw an ArithmeticException
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("Exception caught: Division by zero is not allowed.");
//        }
//        System.out.println("Program continues...");
//    }
//}


public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("This block is always executed.");
        }
        System.out.println("Hello Next code");
    }
}
