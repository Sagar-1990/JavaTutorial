import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {
//    public static void main(String[] args) throws IOException {
//        File myfile =new File("textile.txt");
//
//        if(myfile.createNewFile()){
//            System.out.println("file has created");
//        }else{
//            System.out.println("File already exist");
//        }
//
//    }
    public static void main(String[] args) {
        try{
            FileWriter myFile = new FileWriter("textfile.txt");
            myFile.write("This is a apple test file");
            myFile.close();
        }catch(Exception e){
            System.out.println("some error occured"+ e);
        }

    }
}
