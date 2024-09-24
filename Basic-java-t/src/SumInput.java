/*  #1 Write a java program to find sum of numbers entered by user
      Example: Numbers entered by user = 10 , 20
               Sum of numbers entered by user = 30
      Example: Enter the count of numbers = 5
               Numbers entered by user = 10, 20, 30, 40, 50
               Sum of numbers entered by user = 150
 */

import java.util.Scanner;

public class SumInput {
    public static void main(String[] args){

       // Example 1
        int num1, num2;
        System.out.println("Enter 1st number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        num2 = sc.nextInt();
        System.out.println("Sum: "+ (num1+num2));


        // Example 2
//        int count;                      // define count of nubers for sum
//        System.out.println("Enter count: ");
//        Scanner sc = new Scanner(System.in);   // define object scanner for enter count and number from system
//        count = sc.nextInt();
//        int number, sum=0;  // declare number which will enter and sum which add and save in sum which is start from zero due to they first save sum values.
//
//        for (int i=0; i<count;i++){
//            number = sc.nextInt();      // this will continue loop for enter number that is declare by user in count
//            sum += number;
//        }
//        System.out.println("Sum of the numbers: "+ sum );  // this is the result of sum of all nubers which is enter by user.


    }
}


