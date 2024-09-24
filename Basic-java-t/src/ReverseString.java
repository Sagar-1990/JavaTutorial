/*  Java code for reverse string
    String = "asd"
    Reverse String = "dsa"
 */

import java.util.Scanner;

public class ReverseString {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sting: ");
        String str = sc.nextLine();
        String rev = "";

    /*    for (int i=str.length()-1;i>=0;i--){         // by using decrement loop
            rev += str.charAt(i);
        }
        System.out.println("Reverse String: "+ rev);
    */


        char ch;
        for (int i=0;i<str.length();i++){         // by using increment loop
            ch = str.charAt(i);
            rev = ch +rev;
        }
        System.out.println("Reverse String: "+ rev);

    }
}
