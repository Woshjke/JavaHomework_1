package lab7.task7.classes;

import lab7.task7.CoffeeDrink;
import lab7.task7.GroudCoffee;
import lab7.task7.interfaces.EspressoCoffeeMachine;
import lab7.task7.interfaces.FilterCoffeeMachine;

public class MultiCoffeeMachine implements FilterCoffeeMachine, EspressoCoffeeMachine {

    @Override
    public CoffeeDrink brewEspresso() {
        return null;
    }

    @Override
    public CoffeeDrink brewFilterCoffee() {
        return null;
    }

    @Override
    public void addGroundCoffee(GroudCoffee coffee) {

    }
}
