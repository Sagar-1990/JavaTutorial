import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter String: ");
        str = sc.nextLine();

        int revNumber = 0, Temp=number;
        while (Temp>0){
            int remainder = Temp % 10;
            revNumber = revNumber * 10 + remainder;
            Temp = Temp / 10;
        }
        String revStr = "";
        for (int i=str.length()-1;i>=0;i--){         // by using decrement loop
            revStr += str.charAt(i);
        }
        if (number == revNumber){
            System.out.println("number is palindrome: "+revNumber);
        }else{
            System.out.println("number is not palindrom: "+revNumber);
        }

        if (str.equals(revStr)){
            System.out.println("String is palindrome: "+revStr);
        }else {
            System.out.println("String is not palindrome: "+revStr);
        }

        sc.close();

    }

}
