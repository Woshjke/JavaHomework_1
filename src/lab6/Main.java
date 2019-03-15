package lab6;

import lab6.task1.Task1;
import lab6.task2.Task2;
import lab6.task3.Task3;
import lab6.task4.Task4;
import lab6.task7.Task7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        //Task1
        Task1.execute();

        //Task2
        try {
            Task2.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Task3
        Task3.execute();


        //Task4
        Task4.execute();

        //Task7
        try {
            Task7.execute();
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("Поймали исключение");
        }
    }
}
