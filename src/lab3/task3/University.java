package lab3.task3;

import lab3.task3.Department;
import lab3.task3.Group;
import lab3.task3.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class University {
    public static void showDepartments(ArrayList<Department> departments) {
        departments.forEach(v -> System.out.println(v.getName()));
    }

    public static void showGroups(ArrayList<Group> groups) {
        groups.forEach(v -> System.out.println(v.getId()));
    }

    public static void showStudents(ArrayList<Student> students) {
        students.forEach(v -> System.out.println(v.getFirstName() + " " + v.getLastName()));
    }

    public static void showHeadmans(ArrayList<Group> groups) {
        groups.forEach(v -> System.out.println(v.getHeadman().getFirstName() + v.getHeadman().getLastName()));
    }

    public static ArrayList<Student> getStudentByName (ArrayList<Student> students, String lastName) {
        ArrayList<Student> arr2 = new ArrayList<>();

        for (Student val : students) {
            if (val.getLastName().equals(lastName)) {
                arr2.add(val);
            }
        }
        return arr2;
    }
}
