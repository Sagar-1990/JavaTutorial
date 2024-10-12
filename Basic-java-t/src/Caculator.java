import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("use operation: +,-,*,%,/");
        char operator = sc.next().charAt(0);
        int result = 0;

       /* if (operator == '+') {
            result = a+b;
        } else if (operator == '-') {
            result = a-b;
        } else if (operator == '*') {
            result = a*b;
        } else if (operator == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Invalid operator! Please choose +, -, *, %, or /.");
            return;  // Exit the program
        }

        // Output the result
        System.out.println("The result is: " + result);
*/
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                // Check for division by zero
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;  // Exit the program
                }
                break;
            case '%':
                // Check for division by zero
                if (b == 0) {

                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    result = a % b;
                    return;  // Exit the program
                }
                break;
            default:
                System.out.println("Invalid operator! Please choose +, -, *, or /.");
                return;  // Exit the program
        }

        // Output the result
        System.out.println("The result is: " + result);
        

    }
}
