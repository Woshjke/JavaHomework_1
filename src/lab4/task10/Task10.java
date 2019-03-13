package lab4.task10;

public class Task10 {
    /**
     * Проверить комметарий пользователя на наличие html тегов и убрать их при необходимости
     *
     * @param string - проверяемая строка
     * @return - строка с удаленными html-тегами
     */
    public static String removeHtmlTags(String string) {
        return string.replaceAll("<.*?>", "");
    }
}
