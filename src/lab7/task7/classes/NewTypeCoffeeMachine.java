package lab7.task7.classes;

import lab7.task7.CoffeeDrink;
import lab7.task7.GroudCoffee;
import lab7.task7.interfaces.FilterCoffeeMachine;
import lab7.task7.interfaces.NewTypeCoffee;

public class NewTypeCoffeeMachine implements FilterCoffeeMachine, NewTypeCoffee {
    @Override
    public CoffeeDrink brewFilterCoffee() {
        return null;
    }

    @Override
    public void addGroundCoffee(GroudCoffee coffee) {

    }

    @Override
    public CoffeeDrink brewNewTypeOfCoffee() {
        return null;
    }
}
