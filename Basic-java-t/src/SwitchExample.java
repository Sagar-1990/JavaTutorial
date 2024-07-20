import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args){
        System.out.println("Switch Example");

        int day = 8;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("The day is: " + dayName);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int dayNew = scan.nextInt();
        String dayNameNew;

        switch (dayNew) {
            case 1:
                dayNameNew = "Sunday";
                break;
            case 2:
                dayNameNew = "Monday";
                break;
            case 3:
                dayNameNew = "Tuesday";
                break;
            case 4:
                dayNameNew = "Wednesday";
                break;
            case 5:
                dayNameNew = "Thursday";
                break;
            case 6:
                dayNameNew = "Friday";
                break;
            case 7:
                dayNameNew = "Saturday";
                break;
            default:
                dayNameNew = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayNameNew);
    }
}
