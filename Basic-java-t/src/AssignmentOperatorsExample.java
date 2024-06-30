public class AssignmentOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Simple assignment
        int result = a;
        System.out.println("Simple Assignment: result = " + result); // Output: 10

        // Compound assignments
        result += b; // result = result + b
        System.out.println("Add and Assign: result = " + result); // Output: 15

        result -= b; // result = result - b
        System.out.println("Subtract and Assign: result = " + result); // Output: 10

        result *= b; // result = result * b
        System.out.println("Multiply and Assign: result = " + result); // Output: 50

        result /= b; // result = result / b
        System.out.println("Divide and Assign: result = " + result); // Output: 10

        result %= b; // result = result % b
        System.out.println("Modulus and Assign: result = " + result); // Output: 0

        result = a; // Reset result to a

        result &= b; // result = result & b
        System.out.println("Bitwise AND and Assign: result = " + result); // Output: 0

        result = a; // Reset result to a

        result |= b; // result = result | b
        System.out.println("Bitwise OR and Assign: result = " + result); // Output: 15

        result = a; // Reset result to a

        result ^= b; // result = result ^ b
        System.out.println("Bitwise XOR and Assign: result = " + result); // Output: 15

        result = a; // Reset result to a

        result <<= 2; // result = result << 2
        System.out.println("Left Shift and Assign: result = " + result); // Output: 40

        result >>= 2; // result = result >> 2
        System.out.println("Right Shift and Assign: result = " + result); // Output: 10

        result >>>= 2; // result = result >>> 2
        System.out.println("Unsigned Right Shift and Assign: result = " + result); // Output: 2
    }
}
