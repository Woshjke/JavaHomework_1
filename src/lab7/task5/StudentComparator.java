package lab7.task5;

import java.util.Comparator;

public enum StudentComparator implements Comparator<Student>, LogingSupport  {
    AGE,
    NAME,
    RESULT;

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAverageScore() > o2.getAverageScore()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public void log() {

    }


}
