package lab4.task9;

public class Task9 {
    /**
     * Является ли строка валидным мобильным номером телефона РБ
     * соит обратить внимание, что номер может начинаться с символа «+» и может быть без него,
     * «8» и нет, и другие варианты – проверка должна осуществляться регулярными выражениями.
     *
     * @param phoneNumber - номер телефона
     * @return - является ли номером телефона РБ
     */
    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^([+][375]).{11}$") || phoneNumber.matches("^[80].{10}$");
    }
}
