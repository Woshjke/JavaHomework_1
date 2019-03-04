package lab4.task8;

public class Task8 {

    /**
     * Программа проверяет состоит ли строка из последовательности символов, стоящих на четных и нечетных позициях.
     * На вход подается три строки.
     * 1 - последовательность символов, стоящих на четных позиций
     * 2 - последовательность символов, стоящих на нечетных позиций
     * 3 - проверяемая строка
     *
     * Ваша задача: найти ошибки в коде, чтобы программа работала корректно.
     * Ожидаемые результаты описаны в комментариях.
     *
     * p.s. код носит ознакомительный характер
     * p.s.s. пример -
     * ИЬО ПСМ ПИСЬМО
     * -->
     * П С М
     *  И Ь О
     * ПИСЬМО
     * @param args
     */
    public static void main(String[] args) {
        execute("аадш", "крна", "карандаш"); //true
        execute("нг", "киа", "книга"); // true
        execute("ги", "кна", "книга"); //false
        execute("лко", "бонт", "блокнот"); // true
        execute("лкот", "боны", "блокноты"); // false
    }

    private static void execute(String str1, String str2, String str3) {
        System.out.println("Проверяемая строка: " + str3);
        System.out.println("Последовательности четных и нечетных символов: " + str1 + " и " + str2);
        System.out.println("Состоит ли строка из данных последовательностей: " + checkStringCombination(str1, str2, str3) + "\n");
    }

    private static boolean checkStringCombination(String evenSymbols, String oddSymbols, String checkString) {
        int i = 0, j = 0, k = 0;
        int evenLength = evenSymbols.length();
        int oddLength = oddSymbols.length();
        int stringLength = checkString.length();

        if (evenLength + oddLength != stringLength) {
            return false;
        }

        /*
        k - идет по проверяемой строке
        i - идет по строке с нечетными символами
        j - идет по строке с четными символами
         */
        while (k < stringLength) {
            if (i < oddLength && oddSymbols.charAt(i) == checkString.charAt(k)) {
                i++;
            } else {
                return false;
            }
            k++;

            /*
            Ошибка была сдесь: Если после выполнения блока кода с проверкой нечетных символов мы дошли до конца проверяемой строки,
            то это никак не проверялось и блок кода с проверкой четных символов всегда возвращал false.
             */

            //Теперь проверка стоит в правильном месте и ошибки не возникает. Раньше он стоял в конце цикла и был бесполезен.
            if (k == stringLength) {
                break;
            }

            if (j < evenLength && evenSymbols.charAt(j) == checkString.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;

        }

        return (j == evenLength && i == oddLength);
    }
}
