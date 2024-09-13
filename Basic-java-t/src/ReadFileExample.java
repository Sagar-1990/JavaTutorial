import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
//    public static void main(String[] args) throws FileNotFoundException {
//        File fileObj = new File("appleW2.text");
//        Scanner reader = new Scanner(fileObj);
//        while (reader.hasNextLine()){
//            String data = reader.nextLine();
//            System.out.println(data);
//        }
//    }
    public static void main(String[] args){
    try{
        File fileObj = new File("appleW2.text");
        Scanner reader = new Scanner(fileObj);
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);
        }
    }catch(Exception e){
        System.out.println("some error occured"+ e);
}}}
