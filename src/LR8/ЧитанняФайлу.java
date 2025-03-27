package LR8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ЧитанняФайлу {
    public static void прочитатиФайл(String імяФайлу) {
        try {
            File файл = new File(імяФайлу);
            if (!файл.exists()) {
                System.out.println("Файл не існує");
                return;
            }

            FileReader reader = new FileReader(файл);
            Scanner scanner = new Scanner(reader);
            System.out.println("Вміст файлу:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}