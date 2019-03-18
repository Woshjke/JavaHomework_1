package lab7.task6;

import lab7.task6.builders.Director;
import lab7.task6.buildings.House;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        House house = director.buildHouse();

        System.out.println(house.toString());
        director.showProgress();
    }
}

