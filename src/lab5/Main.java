package lab5;

import lab5.task1.FormulaOneEmploye;
import lab5.task1.FormulaOneJuniorMechanic;
import lab5.task1.FormulaOneMechanic;
import lab5.task1.FormulaOneRacer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormulaOneEmploye> staff = new ArrayList<>(6);
        staff.add(new FormulaOneRacer("Jeka", 5));
        staff.add(new FormulaOneRacer("Max", 3));
        staff.add(new FormulaOneMechanic("Sasha", 200));
        staff.add(new FormulaOneMechanic("Valera", 30 ));
        staff.add(new FormulaOneJuniorMechanic("Lena", 300));

        for (FormulaOneEmploye iter : staff) {
            System.out.println(iter.paySalary());
        }
    }

}
