package lab4.task2;

public class Task2 {
    public static void isReversString(String originStr) {
        String linkedString = originStr.replaceAll("\\s+", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(linkedString);

        if (linkedString.equals(stringBuilder.reverse().toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
