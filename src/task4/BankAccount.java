package task4;

public class BankAccount {
    private int value;
    private double procent;

    BankAccount(int value, double procent){
        this.value = value;
        this.procent = procent;
    }

    public void doubleValue(){
        int startedValue = value;
        int mounthCount = 0;
        do {
            mounthCount++;
            value += value * (procent/100);
        }
        while (value < (startedValue*2) );
        System.out.println("Count of month needed to double your money value: " + mounthCount);
        System.out.println("You value after " + mounthCount + " month = " + value);
        value = startedValue;
    }
}
