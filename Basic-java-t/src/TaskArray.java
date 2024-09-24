import java.util.ArrayList;
import java.util.Scanner;

public class TaskArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
            System.out.println("Enter positive numbers: ");
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            numbers.add(num);
        }
        for (int i = numbers.size()-1; i >=0; i--) {
            System.out.println("Get postive numbers: "+numbers.get(i)+" ");
        }
        sc.close();
    }
}
