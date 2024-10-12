import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for factorial: ");
        int number = sc.nextInt();

//        int fact = 1;
        int result= countTrailingZeros(number);

//        for (int i=2; i<=number; i++){              // this  code is not sufficient for
//            fact = fact*i;
//        }
//        System.out.println("Factorial of number: "+fact);
//
//
//        while(fact % 10 == 0){
//            result++;
//            fact = fact/10;
//        }
//        System.out.println("count of zero: "+result);

        // Output the result
        System.out.println("Number of trailing zeros in factorial of " + number + " is: " + result);
    }
    public static int countTrailingZeros(int number) {
        int result = 0;

        // Count how many times 5 is a factor in numbers from 1 to 'number'
        for (int i = 5; i <= number; i = i*5) {
            result = result+ number / i;
        }
        return result;

    }
}
