import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 2: Get a string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);

        // Step 3: Get an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        // Step 4: Get a double input
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is: " + gpa);

        // Step 5: Get a boolean input
        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student status: " + isStudent);

        // Closing the scanner
        //scanner.close();
    }
}
