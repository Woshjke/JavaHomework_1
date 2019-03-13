package lab5.task1;

public abstract class FormulaOneEmploye {
    private String name;
    private double rate;
    private double balance;

    private static double tax;

    static {
        tax = 0.13;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getRate() {
        return rate;
    }

    void setRate(double rate) {
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance += balance;
    }

    public double paySalary() {
        return 0;
    }

    public void work() {
    }

    public double getTax() {
        return tax;
    }

    public static void setTax(double tax) {
        FormulaOneEmploye.tax = tax;
    }

    public double payTax(double salary) {
        return paySalary() * tax;
    }

}
