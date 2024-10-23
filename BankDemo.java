abstract class Bank {
    abstract double getRateInterest();
}

class SBI extends Bank {
    double getRateInterest() {
        return 5.5;
    }
}

class PMC extends Bank {
    double getRateInterest() {
        return 6.0;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank pmc = new PMC();

        System.out.println("SBI Rate of Interest: " + sbi.getRateInterest());
        System.out.println("PMC Rate of Interest: " + pmc.getRateInterest());
    }
}
