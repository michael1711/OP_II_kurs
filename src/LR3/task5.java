package LR3;

import java.util.Scanner;
public class task5 {
    public void vuvid() {
        int lich = 0;
        double y = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть діапазон пошуку значень: ");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        System.out.println("Значення функції:");
        for (double i = -1; i <= 2; i += 0.2) {
            y = Math.pow(i, 5) - i + 1.8;
            System.out.println(y);
            if (x1 <= y && y <= x2 || x2 <= y && y <= x1) {
                lich += 1;
            }
        }
        System.out.println("Виконується пошук у діапазоні " + x1 + "-" + x2);
        System.out.println("Знайдено значень: " + lich);
    }
}