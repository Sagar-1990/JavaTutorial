import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample2 {
    public static void main(String[] args) {
        try {
            // Step 1: Create a File object
            File file = new File("example.txt");

            // Step 2: Check if the file already exists
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Step 3: Write to the file using FileWriter
            FileWriter myWriter = new FileWriter("example.txt");
            myWriter.write("Hello, this is a sample text written to the file!");
            myWriter.close();  // Close the writer
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            // Handle any IOExceptions
            System.out.println("An error occurred while handling the file.");
            e.printStackTrace();
        }
    }
}



