import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Declare and create the array with the given size
        int[] numbers = new int[size];

        // Get input from the user to populate the array
        for (int i = 0; i < size; i++) {
//            System.out.print("Enter element for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }

        // Display the array elements
        // System.out.println("Array elements are:");
        for (int i = numbers.length-1; i >=0; i--) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        int x = sc.nextInt();
        for (int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println(x+" Found at index: "+i);
            }
        }

        sc.close();
    }
}

