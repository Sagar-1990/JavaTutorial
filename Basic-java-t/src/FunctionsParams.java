import java.sql.SQLOutput;

public class FunctionsParams {
    public static void main(String[] args) {


        int user1Age = 20;
        getAgeInDays(user1Age);

        int amount = 100000;
        int time = 3;
        double rate = 12.5;
        calculateInterest(amount,time,rate);

        double principal = 1000; // Principal amount
        double rateA = 5; // Annual interest rate in percentage
        int timeA = 10; // Time period in years
        int n = 4; // Number of times interest is compounded per year

        double compoundInterest = calculateCompoundInterest(principal, rateA, timeA, n);
        System.out.println("Compound Interest: " + compoundInterest);

        }


        public static void getAgeInDays(int age){
            System.out.println(age*365);
        }

        public static void calculateInterest(int amount, int time, double rate){
            System.out.println(amount+((amount*time*rate)/100));
        }

        public static double calculateCompoundInterest(double principal, double rateA, int timeA, int n) {
            double amount = principal * Math.pow(1 + (rateA / (n * 100)), n * timeA);
            return amount - principal;
        }


}
