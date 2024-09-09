class Calculator {
    // Overloaded method 1: Adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method 2: Adding three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method 3: Adding two doubles
    public double add(double a, double b) {
        return a + b;
    }
}
class AdvancedCalculator extends Calculator {
    // Overloaded method 4: Adding four integers (new overload in child class)
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // Overloaded method 5: Adding two float numbers (new overload in child class)
    public float add(float a, float b) {
        return a + b;
    }
}
public class MethodOverlodingwithInhritance {
    public static void main(String[] args) {
        // Create an object of the child class
        AdvancedCalculator calc = new AdvancedCalculator();

        // Calling overloaded methods from parent and child class
        System.out.println("Add two integers: " + calc.add(2, 3));                // Calls add(int, int) from parent class
        System.out.println("Add three integers: " + calc.add(1, 2, 3));          // Calls add(int, int, int) from parent class
        System.out.println("Add two doubles: " + calc.add(2.5, 3.5));            // Calls add(double, double) from parent class
        System.out.println("Add four integers: " + calc.add(1, 2, 3, 4));        // Calls add(int, int, int, int) from child class
        System.out.println("Add two floats: " + calc.add(1.5f, 2.5f));           // Calls add(float, float) from child class
    }
}


