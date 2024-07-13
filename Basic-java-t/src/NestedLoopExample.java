import java.util.Scanner;

public class NestedLoopExample {
    public static void main(String[] args){
//        for(int i=1; i<=10;i++){
//            System.out.println("I value is "+ i);
//            for(int j=1; j<=5 ; j++){
//                System.out.println(j);
//            }
//        }

//      Example for loop inside in loop
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter max value i");
        int userVal = scan.nextInt();
        System.out.println("Enter max value2 j");
        int value2 = scan.nextInt();



        for(int i=1;i<=userVal;i++){
            System.out.println("loop count = "+i);
            for (int j = 1; j <= value2; j++){
                System.out.println(j);
            }
        }

    }
}
