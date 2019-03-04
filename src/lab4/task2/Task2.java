package lab4.task2;

public class Task2 {
    /**
     * Дана строка, состоящая из букв и пробелов.
     * Проверьте, читается ли она одинаково слева на право и справа на лево без учета пробелов и регистра.
     *
     * @param originStr - исходная строка
     */
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
