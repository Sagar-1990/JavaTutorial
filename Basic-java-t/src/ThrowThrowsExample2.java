public class ThrowThrowsExample2 {
    public static void main(String[] args) {
        try {
            validateAge(19); // Calling the method with an invalid value
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // Method to validate age and throw an exception
    public static void validateAge(int age) {
        if (age < 18) {
            // Explicitly throwing an unchecked exception
            throw new ArithmeticException("Age not valid for voting");
        } else {
            System.out.println("Welcome to vote!");
        }
    }
}

