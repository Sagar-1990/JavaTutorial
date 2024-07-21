import java.util.Scanner;

public class TwoDArrayWithInput {
    public static void main(String[] args){

        int d1=3;
        int d2=3;
        String str[][]= new String[d1][d2];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2D array values");

        for (int i=0;i<d1;i++){
            for (int j=0;j<d2;j++){
                str[i][j]=scan.next();
            }
        }

        for (int i=0; i<str.length; i++){
//            System.out.println(matrix[i]);
            for (int j=0; j<str[i].length; j++){
                System.out.println("I:"+i+" J:"+j+"--->"+str[i][j]);
            }
        }
    }
}
