package LR2;

import java.util.Scanner;
public class formula {
    public static void rahuvatu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть зміннну х для функції: ");
        double x = scanner.nextDouble();

        if(x < 0) {
            System.out.println(Math.abs(x+7));
        }
        else if (0 <= x && x <= 5) {
            System.out.println(Math.sqrt(x)+Math.pow(x-1, 1/4));
        }
        else {
            System.out.println(Math.log(x));
        }
    }
}