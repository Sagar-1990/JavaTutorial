import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteMultipleFiles {
    public static void main(String[] args){
//        // Step 1: Create a folder (directory)
//        File folder = new File("MyFilesFolder1");
//        if (!folder.exists()) {
//            if (folder.mkdir()) {
//                System.out.println("Folder created: " + folder.getName());
//            } else {
//                System.out.println("Failed to create folder.");
//                return;  // Exit if folder creation fails
//            }
//        }
        try{
            for (int i=0;i<=20;i++){
                String fileName="MyFilesFolder/Testing"+i+".txt";
                FileWriter writer = new FileWriter(fileName);
                writer.write("This is the sample data" + fileName);
                writer.close();
                System.out.println(fileName + "Created");
            }
        } catch (IOException e) {
            System.out.println("Come error" +  e);
        }
    }
}
