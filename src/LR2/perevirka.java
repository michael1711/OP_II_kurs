package LR2;

import java.util.Scanner;
public class perevirka {
    public static void check_num() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int num = scanner.nextInt();

        if (num >= 10 && num <= 99 && num % 2 == 0) {
            System.out.println("Число " + num + " є двозначним і парним.");
        }
        else if (num >= 10 && num <= 99) {
            System.out.println("Число " + num + " є двозначним");
        }
        else if (num % 2 == 0) {
            System.out.println("Число " + num + " є парним");
        }
        else {
            System.out.println("Число " + num + " не є двозначним парним.");
        }
    }
}