public class NestedIfElse {
    public static void main(String[] args) {
        //Simple if Statement:

        /*int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        */

        //if-else Statement:

        /*int number = -10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        } 
        */
        
        // if-else-if Ladder:

       /* int number = 0;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        */

        // Nested if Statement:
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            }
        }

    }
}
