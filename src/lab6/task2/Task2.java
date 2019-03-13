package lab6.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {

    /**
     * Считать файл с файловой системы.
     * Обработать возможные ошибки через несколько catch.
     * @throws IOException - выбрасывает исключение, если не удалось закрыть файловый поток
     */
    public static void execute() throws IOException {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("D:\\file.txt");
            int readedChar;
            while ((readedChar = fileInputStream.read()) != -1) {
                System.out.print((char) readedChar);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Данный файл не найден в системе");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert fileInputStream != null;
            fileInputStream.close();
        }
    }
}
