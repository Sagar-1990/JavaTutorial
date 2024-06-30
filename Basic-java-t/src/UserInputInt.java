
import java.util.Scanner;

public class UserInputInt {
    public static void main(String[] args) {
        
        System.out.println("Please enter any name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Your name is");
        System.out.println(name);

    }
}
