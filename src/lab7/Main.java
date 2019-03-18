package lab7;

import lab7.task1.AllOverParticipantImpl;
import lab7.task1.JumpingAthleteImpl;
import lab7.task1.SwimmingAthleteImpl;
import lab7.task1.TeamPlayerImpl;
import lab7.task2.Task2;
import lab7.task2.Week;
import lab7.task3.MathOperator;
import lab7.task5.Student;
import lab7.task5.StudentComparator;
import lab7.task6.builders.Director;
import lab7.task6.buildings.House;

public class Main {
    public static void main(String[] args) {
        SwimmingAthleteImpl swimmer = new SwimmingAthleteImpl();
        JumpingAthleteImpl jumper = new JumpingAthleteImpl();
        TeamPlayerImpl teamPlayer = new TeamPlayerImpl();
        AllOverParticipantImpl athlete = new AllOverParticipantImpl();

        swimmer.participate();
        jumper.participate();
        teamPlayer.participate();
        athlete.participate();

        Week a;
        a = Week.SATURDAY;
        System.out.println(a.getAbbreviation());
        System.out.println(a.isWeekend());
        System.out.println(a.getText());

        for (Week e : Week.values()) {
            System.out.println(e.name());
        }

        Week b = Week.valueOf("FRIDAY");
        switch (b) {
            case FRIDAY: {
                System.out.println("FRIDAY");
                break;
            }
            case SATURDAY: {
                System.out.println("SATURDAY");
                break;
            }
        }

        if (b == Week.FRIDAY) {
            System.out.println("True");
        }
        if (a.name().equals("SATURDAY")) {
            System.out.println("True");
        }

        MathOperator e = MathOperator.ADD;
        System.out.println(e.execute(1, 3));

        Student st1 = new Student("Evgen", 19, 7.2);
        Student st2 = new Student("Pasha", 20, 9.3);

        System.out.println(StudentComparator.RESULT.compare(st1, st2));
        StudentComparator.NAME.log("Massage", st1);

        //Task7
        Director director = new Director();
        House house = director.buildHouse();

        System.out.println(house.toString());
        director.showProgress();
    }
}
