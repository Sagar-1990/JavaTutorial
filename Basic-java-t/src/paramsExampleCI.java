public class paramsExampleCI {

    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5; // Annual interest rate in percentage
        int time = 10; // Time period in years
        int n = 4; // Number of times interest is compounded per year

        double compoundInterest = calculateCompoundInterest(principal, rate, time, n);
        System.out.println("Compound Interest: " + compoundInterest);
    }

    public static double calculateCompoundInterest(double principal, double rate, int time, int n) {
        double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time);
        return amount - principal;
    }
}
