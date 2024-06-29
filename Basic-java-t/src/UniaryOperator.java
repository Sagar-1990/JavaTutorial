public class UniaryOperator{
    public static void main(String[] args) {
        int a = 5;

        // Unary Plus
        int positive = +a; // 5
        System.out.println("Unary Plus: " + positive);

        // Unary Minus
        int negative = -a; // -5
        System.out.println("Unary Minus: " + negative);

        // Prefix Increment
        int prefixInc = ++a; // 6
        System.out.println("Prefix Increment: " + prefixInc);

        // Postfix Increment
        int postfixInc = a++; // 6
        System.out.println("Postfix Increment: " + postfixInc);
        System.out.println("Value after Postfix Increment: " + a); // 7

        // Prefix Decrement
        int prefixDec = --a; // 6
        System.out.println("Prefix Decrement: " + prefixDec);

        // Postfix Decrement
        int postfixDec = a--; // 6
        System.out.println("Postfix Decrement: " + postfixDec);
        System.out.println("Value after Postfix Decrement: " + a); // 5

        // Logical Complement
        boolean flag = true;
        boolean notFlag = !flag; // false
        System.out.println("Logical Complement: " + notFlag);
    }
}
