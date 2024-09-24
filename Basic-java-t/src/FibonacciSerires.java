/*  Java Program for Fibonacci Series
    The Fibonacci series is a series where the next term is the sum of the previous teo terms.
    The first two of the Fibonacci series are 0 follwed by 1.
    Fibonacci series : 0, 1, 1, 2, 3, 5, 8, 13, 21, 24.....
 */

import java.util.Scanner;

public class FibonacciSerires {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci Series: ");
        int n = sc.nextInt();
        int firstNum=0;
        int secondNum=1;
        int nextNum;

        for (int i=0;i<=n;i++){
            System.out.print(firstNum+",");
            nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }
    }
}

//import java.util.Scanner;
//
//public class FibonacciSerires {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number of terms for Fibonacci series: ");
//        int n = scan.nextInt();  // Number of terms to be printed
//
//        int firstTerm = 0, secondTerm = 1;
//
//        System.out.println("Fibonacci Series: ");
//
//        // Print first two terms
//        System.out.print(firstTerm + ", " + secondTerm);
//
//        // Loop to calculate and print the next terms
//        for (int i = 3; i <= n; i++) {
//            int nextTerm = firstTerm + secondTerm;  // Calculate the next term
//            System.out.print(", " + nextTerm);  // Print the next term
//            firstTerm = secondTerm;  // Update firstTerm
//            secondTerm = nextTerm;   // Update secondTerm
//        }
//    }
//}


