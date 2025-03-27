package LR6;

import java.util.Scanner;

public class Багаж {
    private int кількістьРечей;
    private double[] вагиРечей;

    // Метод введення кількості і ваги
    public void ввестиДані() {
        Scanner scanner = new Scanner(System.in);

        // Валідація
        while (true) {
            System.out.print("Введіть кількість речей (не менше 1 і не більше 10): ");
            if (scanner.hasNextInt()) {
                кількістьРечей = scanner.nextInt();
                if (кількістьРечей > 0 && кількістьРечей < 11) break;
                else System.out.println("Помилка: кількість речей повинна бути більшою за 0, або не більшою 10");
            } else {
                System.out.println("Помилка: введіть ціле число!");
                scanner.next();
            }
        }

        вагиРечей = new double[кількістьРечей];

        for (int i = 0; i < кількістьРечей; i++) {
            while (true) {
                System.out.print("Введіть вагу речі " + (i + 1) + " (кг, більше 0): ");
                if (scanner.hasNextDouble()) {
                    вагиРечей[i] = scanner.nextDouble();
                    if (вагиРечей[i] > 0) break;
                    else System.out.println("Помилка: вага повинна бути більшою за 0!");
                } else {
                    System.out.println("Помилка: введіть число!");
                    scanner.next();
                }
            }
        }
    }

    // Метод розрахунку загальної ваги
    public double отриматиЗагальнуВагу() {
        double загальнаВага = 0;
        for (double вага : вагиРечей) {
            загальнаВага += вага;
        }
        return загальнаВага;
    }

    // Метод для виведення загальної ваги
    public void вивестиЗагальнуВагу() {
        System.out.println("Загальна вага багажу: " + отриматиЗагальнуВагу() + " кг");
    }
}