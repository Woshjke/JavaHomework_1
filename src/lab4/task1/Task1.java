package lab4.task1;

public class Task1 {
    /**
     * Ввод строки с клавиатуры.
     * Посчитать сколько слов-палиндромов встречается во всей строке и процент слов-палиндромов в строке
     *
     * @param originString - исходная строка
     */
    public static void isPalindrome(String originString) {
        String[] array = originString.split(" ");
        StringBuilder tempStr;
        double palindromeCount = 0;

        for (String iter : array) {
            tempStr = new StringBuilder(iter);

            if (iter.equals(tempStr.reverse().toString())) {
                palindromeCount++;
            }
        }

        System.out.println("Количество палиндромов: " + palindromeCount + "\nПроцент палиндромов: " + (palindromeCount / array.length * 100));
    }
}
