package lab6.task5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {

    /**
     * Считать файл с файловой системы используя BufferedReader.
     * Предусмотреть закрытие ресурсов, не используя блока finally.
     */
    public static void execute() {
        try (FileInputStream fstream = new FileInputStream("D:\\file.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}
