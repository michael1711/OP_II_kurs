package LR2;

import java.util.Scanner;
public class kvadr_rivn {

        public static void solveEq() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть коефіцієнти a, b, c через пробіл: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1 = (-b + Math.sqrt(D)) / (2 * a);
                double x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Два розв’язки: x1 = " + x1 + ", x2 = " + x2);
            }
            else if (D == 0) {
                double x = -b / (2 * a);
                System.out.println("Єдиний розв’язок: x = " + x);
            }
            else {
                System.out.println("Розв’язків немає (D < 0)");
            }
        }
}