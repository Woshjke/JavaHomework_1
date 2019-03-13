package lab6.task4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

    /**
     * Считать файл с файловой системы используя BufferedReader.
     * Предусмотреть закрытие ресурсов.
     */
    public static void execute() {
        FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("D:\\file.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        } finally {
            try {
                assert fstream != null;
                fstream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
