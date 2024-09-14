import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        try{
            for (int i=5;i<=10;i++){
                File file = new File("MyFilesFolder/Testing"+i+".txt");
                file.delete();
                System.out.println(" file deleted Testing"+i+".txt");
            }
        }catch (Exception e){
            System.out.println("Some error" + e);
        }
    }
}
