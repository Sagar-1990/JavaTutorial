import java.util.Scanner;

public class FactorialOfaNumberUsingRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scan.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}









