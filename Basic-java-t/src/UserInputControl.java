import java.util.Scanner;

public class UserInputControl {
    public static void main(String[] args){
       // System.out.println("Enter your Age");
        // Scanner input = new Scanner(System.in);
       /* int age = input.nextInt();
        if (age>=18){
            System.out.println("Welcome to the club");
        }else{
            System.out.println("Try Again");
        }
        */
        //Example-2
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        // Use if-else statement to check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        input.close();


    }
}
