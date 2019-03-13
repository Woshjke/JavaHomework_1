package lab5.task1;

public class FormulaOneRacer extends FormulaOneEmploye {
    private int countOfRaces;

    public FormulaOneRacer(String name, int countOfRaces) {
        super.setName(name);
        this.countOfRaces = countOfRaces;
        this.setBalance(0);
        this.setRate(0.13);
    }

    public int getCountOfRaces() {
        return countOfRaces;
    }

    public void setCountOfRaces(int countOfRaces) {
        this.countOfRaces = countOfRaces;
    }

    @Override
    public double paySalary() {
        return countOfRaces * getRate();
        //salary -= payTax(salary);
        //System.out.println("Salary: " + salary);
        //setBalance(salary);
    }

    @Override
    public void work() {
        countOfRaces++;
        System.out.println("Working...Done!");
    }

}
