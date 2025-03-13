package LR2;

import java.util.Scanner;
public class kvadrant {
    public static void check_kvadr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть координати x і y через пробіл: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Точка знаходиться в 1-му квадранті.");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Точка знаходиться в 2-му квадранті.");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Точка знаходиться в 3-му квадранті.");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Точка знаходиться в 4-му квадранті.");
        }
        else {
            System.out.println("Точка лежить на осі.");
        }
    }
}