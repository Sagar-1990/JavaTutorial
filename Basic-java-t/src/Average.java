/* Java Program to find Average of numbers Entered by user
    Enter the count of numbers = 5
    Numbers entered by user = 10 20 30 40 50
    Average of numbers by user = 30
 */

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int count;
        System.out.println("Enter count: ");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        int number, sum=0;
        float avg=0;

        for(int i=0; i<count; i++){
            number = sc.nextInt();
            sum += number;
        }
        avg = sum /count;
        System.out.println("sum:"+sum);
        System.out.println("Average: "+ avg);

    }
}
