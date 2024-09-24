/* Java Program to find sum of first n numbers
    Enter n value = 5
    Formula = [n*(n+1)]/2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SumofFirstNnumbers {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int n;
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();
      */
        System.out.println("Enter n number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int sum = (n*(n+1))/2;

        System.out.println("Sum of first numbers: "+sum);

    }
}
