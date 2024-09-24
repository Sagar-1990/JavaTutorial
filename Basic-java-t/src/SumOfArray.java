/* java program to compute Sum and average of array elements
    Numbers in array = {1, 2, 3, 4, 5}
    Sum of numbers in array = 15
    Average of Numbers in array = 3
 */


public class SumOfArray {
    public static void main(String[] args){
        int [] array = {11,12,18,14};
        int length = array.length;
        int sum = 0;

        for(int i=0; i<length;i++){
            sum = sum + array[i];
        }
        System.out.println("Sum of array:"+ sum);
        float avg = (float) sum/length;
        System.out.println("Avg of array:"+ avg);
    }
}
