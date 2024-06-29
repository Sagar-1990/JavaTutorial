public class AllDataTypes{
    public static void main(String[] args) {
        // Primitive data types
        byte byteValue = 127;
        short shortValue = 10000;
        int intValue = 100000;
        long longValue = 1000000000;
        float floatValue = 10.5F;
        double doubleValue = 100.5;
        char charValue = 'A';
        boolean booleanValue = true;

        // Non-Primitive data types
        String stringValue = "Hello, World!";
        int[] intArray = {1, 2, 3, 4, 5};

        // Output
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("String Value: " + stringValue);
        System.out.println("Array Value: " + java.util.Arrays.toString(intArray));
    }
}
