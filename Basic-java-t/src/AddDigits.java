/*  Write java program to add digits in a number
    Example:
    Number enters by user = 123
    Sum of digits = 6

 */

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter number = ");  // Prompt the user to enter a number
        Scanner sc = new Scanner(System.in);  // Create a scanner object to take input from the user
        number = sc.nextInt();
        sc.close();

        int sum=0;  //Variable to store the sum of digits
        int digit;

        // Loop to extract each digit and add it to the sum
        while (number != 0){
            digit = number  % 10; // Get the last digit
            sum += digit;            // Add the digit to the sum
            number = number / 10;     // Remove the last digit from the number
        }
        System.out.println("Sum of digits =" + sum);
    }
}
