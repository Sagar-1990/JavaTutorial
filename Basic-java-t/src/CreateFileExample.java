import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {
//    public static void main(String[] args) throws IOException {
//        File myfile =new File("appleW3.text");
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
            FileWriter myFile = new FileWriter("appleW3.text");
            myFile.write("This is a apple test file" +
                    "iwweiw jwbefbw jwebfw");

            myFile.close();
        }catch(Exception e){
            System.out.println("some error occured"+ e);
        }

    }
}
