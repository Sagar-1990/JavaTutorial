class Bank {
    // Method to be overridden
    public double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    // Overriding the getInterestRate method
    @Override
    public double getInterestRate() {
        return 5.5;
    }
}

class ICICI extends Bank {
    // Overriding the getInterestRate method
    @Override
    public double getInterestRate() {
        return 6.0;
    }
}

public class MethodOverridinginBanking {
    public static void main(String[] args) {
        Bank sbi = new SBI();   // Upcasting
        Bank icici = new ICICI(); // Upcasting

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate());   // Output: SBI Interest Rate: 5.5
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate()); // Output: ICICI Interest Rate: 6.0
    }
}
