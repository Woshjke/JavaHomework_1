package lab7.task5;

public enum StudentComparator
        implements java.util.Comparator<Student>, LogingSupport {

    AGE {
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        public void log() {
            System.out.println("Log: " + name());
        }
    },

    NAME {
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }

        public void log() {
            System.out.println("Log: " + name());
        }
    },

    RESULT {
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.getAverageScore(), o2.getAverageScore());
        }

        public void log() {
            System.out.println("Log: " + name());
        }
    }
}
