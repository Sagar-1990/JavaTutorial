import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
//
//       int result = 1;
//        for(int i=2; i<=number; i++){
//            result = result*i;
//            System.out.println("Factorial of number: "+result); // continous print for each step of factorial result
//        }
//        System.out.println("Factorial of number: "+result);

        // Call the recursive factorial method
        int result = factorial(number);

        // Output the result
        System.out.println("Factorial of number: "+result);
    }

    // Recursive method to calculate factorial
    public static int factorial(int number) {
        // Base case: factorial of 0 or 1 is 1
        if (number == 0 || number == 1) {
            return 1;
        }
        // Recursive call
        return number * factorial(number - 1);

    }
}


