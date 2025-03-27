package LR8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ГенераторЧисел {
    public static void записатиУФайл(String імЯФайлу, int b1, int b2) {
        try {
            File файл = new File(імЯФайлу);
            if (!файл.exists()) {
                файл.createNewFile();
                System.out.println("Файл відсутній, автоматичне створення...");
            } else {
                System.out.println("Файл існує, дані буде перезаписано.");
            }

            FileWriter writer = new FileWriter(файл);
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                writer.write((random.nextInt(b2 - b1 + 1) + b1) + "\n");
            }
            writer.close();
            System.out.println("Дані успішно записані у файл.");
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }
    }
}