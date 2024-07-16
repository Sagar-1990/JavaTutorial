import java.util.Scanner;


public class WhileLoopExample {
    public static void main(String[] args){

        System.out.println("While loop will be here");
//
//        int item = 0;
//        while (item<10){
//            item++;
//        }
//        System.out.println(item);
        System.out.println("Please enter mas value of loop");
        Scanner scan = new Scanner(System.in);
        int maxData = scan.nextInt();
        int data =0;
        while (data<maxData){
            data++;
            System.out.println(data);
        }
    }
}
