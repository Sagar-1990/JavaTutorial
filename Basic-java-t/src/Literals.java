public class Literals {
    public static void main(String[] args) {
        // Integer literals
        int decimal = 100;
        int binary = 0b11001011;
        int octal = 067;
        int hexadecimal = 0x67e;

        // Floating-point literals
        float floatNumber = 10.5F;
        double doubleNumber = 10.5;
        double scientificNumber = 1.05e2;

        // Character literals
        char character = 'A';
        char newLine = '\n';
        char tab = '\t';
        char unicodeCharacter = '\u0041';

        // String literals
        String string = "Hello, World!";

        // Boolean literals
        boolean trueValue = true;
        boolean falseValue = false;

        // Output
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Scientific: " + scientificNumber);
        System.out.println("Character: " + character);
        System.out.println("New Line: [" + newLine + "]");
        System.out.println("Tab: [" + tab + "]");
        System.out.println("Unicode Character: " + unicodeCharacter);
        System.out.println("String: " + string);
        System.out.println("Boolean True: " + trueValue);
        System.out.println("Boolean False: " + falseValue);
    }
}
