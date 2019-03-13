package lab5.task1;

public class FormulaOneMechanic extends FormulaOneEmploye {
    private int countOfHours;

    FormulaOneMechanic() {
        this.setBalance(0);
        this.setRate(0.08);
        setName("Default name");
        this.countOfHours = 0;
    }

    public FormulaOneMechanic(String name, int countOfHours){
        setName(name);
        this.countOfHours = countOfHours;
        this.setBalance(0);
        this.setRate(0.08);
    }

    public int getCountOfHours() {
        return countOfHours;
    }

    void setCountOfHours(int countOfHours) {
        this.countOfHours = countOfHours;
    }

    void getDrunk() {
        System.out.println("Я бухаю!");
    }

    @Override
    public double paySalary() {
        return countOfHours * getRate();
        //salary -= payTax(salary);
        //System.out.println("Salary: " + salary);
        //setBalance(salary);
    }

    @Override
    public void work() {
        countOfHours++;
    }
}
