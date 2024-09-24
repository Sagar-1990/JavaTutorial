import java.lang.*;
import java.util.*;
import java.math.BigInteger;
public class SumUseBigInt{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        String a, b;
        BigInteger A, B;
        Scanner scan = new Scanner(System.in);

        a = scan.nextLine();

        b = scan.nextLine();

        A = new BigInteger(a);
        B = new BigInteger(b);

        BigInteger C = A.add(B);


        System.out.println(C);


    }
}


