import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FoldeCrate {
    public static void main(String[] args) {
        // Step 1: Create a folder (directory)
        File folder = new File("MyFilesFolder");
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Folder created: " + folder.getName());
            } else {
                System.out.println("Failed to create folder.");
                return;  // Exit if folder creation fails
            }
        }

        // Step 2: Use a loop to create and write files in the folder
        for (int i = 1; i <= 5; i++) {
            try {
                // Create a new file in the folder
                File file = new File(folder, "File" + i + ".txt");

                // Step 3: Write content to the file using FileWriter
                FileWriter writer = new FileWriter(file);
                writer.write("This is the content of File" + i);
                writer.close();  // Close the writer after writing

                System.out.println("Successfully wrote to: " + file.getName());

            } catch (IOException e) {
                // Step 4: Handle exceptions
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        }
    }
}


