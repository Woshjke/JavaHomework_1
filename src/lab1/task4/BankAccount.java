package lab1.task4;

public class BankAccount {
    private int value;
    private double percent;

    BankAccount(int value, double percent) {
        this.value = value;
        this.percent = percent;
    }

    /**
     * This method considers how many months a bank account value will double at a given percent.
     */
    public void doubleValue() {
        int startedValue = value;
        int mounthCount = 0;
        do {
            mounthCount++;
            value += value * (percent / 100);
        }
        while (value < (startedValue * 2));
        System.out.println("Count of month needed to double your money value: " + mounthCount);
        System.out.println("You value after " + mounthCount + " month = " + value);
        value = startedValue;
    }
}
