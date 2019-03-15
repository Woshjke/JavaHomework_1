package lab6.task3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task3 {

    /**
     * Считать файл с файловой системы.
     * Обработать возможные ошибки через один catch для всех ошибок.
     */
    public static void execute() {
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream("D:\\file.txt");

            int readChar;
            while ((readChar = fileInputStream.read()) != -1) {
                System.out.print((char) readChar);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}
