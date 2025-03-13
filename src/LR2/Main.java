package LR2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean a = true;
        while(a) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Програму запущено");
            System.out.println("Завдання 1. Розвязування квадратного рівняння         1");
            System.out.println("Завдання 2. Визначення квадратнта точки               2");
            System.out.println("Завдання 3. Перевірка двозначності і парності числа   3");
            System.out.println("Завдання 4. Обчислення функції f(x)                   4");
            System.out.println("Завершити роботу                                      5");
            System.out.print("Оберіть дію: ");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Завдання 1. Розвязування квадратного рівняння");
                    kvadr_rivn.solveEq();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Завдання 2. Визначення квадратнта точки");
                    kvadrant.check_kvadr();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Завдання 3. Перевірка двозначності і парності числа");
                    perevirka.check_num();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Завдання 4. Обчислення функції f(x)");
                    formula.rahuvatu();
                    System.out.println("");
                    break;
                case 5:
                    a = false;
                    break;
            }
        }
    }
}