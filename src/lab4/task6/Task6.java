package lab4.task6;

public class Task6 {
    /**
     * Посчитать сумму числе в строке, игнорируя все не числовые символы.
     * нарпимер,
     * abc123xyz -123
     * aa11b33 -44
     * 7 11 -18
     * @param str - строка
     */
    public static void calculateSumOfNums(String str) {
        String[] arrOfNums = str.split("\\D+");

        int sumOfNums = 0;
        for (String iter : arrOfNums) {
            sumOfNums += Integer.parseInt(iter);
        }

        System.out.println(sumOfNums);
    }
}
