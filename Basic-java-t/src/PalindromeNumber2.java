import java.util.Scanner;

public class PalindromeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");   // I/P teh number
        int x = sc.nextInt();
        int temp = x;          // save original number for comare
        int rev = 0;


        while(temp!=0){           // reverse the number
            int ld = temp%10;
            rev = rev*10+ld;
            temp=temp/10;
        }
        if(rev == x){           // check number is palindrome or not
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome number");
        }
    }
}
