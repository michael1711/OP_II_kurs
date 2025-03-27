package LR8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я файлу: ");
        String імяФайлу = scanner.nextLine().trim() + ".txt";

        System.out.print("Введіть діапазон значень через пробіл: ");
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int верхняМежа = Math.max(b1, b2);
        int нижняМежа =  Math.min(b1, b2);

        ГенераторЧисел.записатиУФайл(імяФайлу, нижняМежа, верхняМежа);
        ЧитанняФайлу.прочитатиФайл(імяФайлу);
    }
}