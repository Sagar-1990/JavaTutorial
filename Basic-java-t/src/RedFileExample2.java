import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RedFileExample2 {
    public static void main(String[] args) {
        try {
            // Step 1: Create a File object for the file you want to read
            File file = new File("example.txt");

            // Step 2: Create a Scanner object to read the file
            Scanner scanner = new Scanner(file);

            // Step 3: Use a while loop to read the file line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);  // Print the line read
            }

            // Step 4: Close the scanner after reading
            scanner.close();

        } catch (FileNotFoundException e) {
            // Step 5: Handle exception if the file is not found
            System.out.println("An error occurred: File not found.");
            e.printStackTrace();
        }
    }
}


