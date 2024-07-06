public class FunctionExample {

    // A simple function to add two numbers
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // A function with no parameters and no return value
    public void greet() {
        System.out.println("Hello, welcome!");
    }

    public static void main(String[] args) {
        // Create an instance of the class to call the methods
        FunctionExample example = new FunctionExample();

        // Call the add function
        int result = example.add(5, 3);
        System.out.println("Sum: " + result); // Output: Sum: 8

        // Call the greet function
        example.greet(); // Output: Hello, welcome!

    }
}
