package lab5.task1;

public class FormulaOneJuniorMechanic extends FormulaOneMechanic {

    public FormulaOneJuniorMechanic(String name, int countOfHours) {
        setCountOfHours(countOfHours);
        setBalance(0);
        setName(name);
        setRate(0.04);
    }

    @Override
    public double paySalary() {
        double salary = super.paySalary();
        getDrunk();
        return salary;
    }
}
