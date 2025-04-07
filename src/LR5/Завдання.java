package LR5;

import java.util.Arrays;

public class Завдання {

    // 1. площа кола
    public static double обчислПлощуКола(double радіус) {
        return Math.PI * радіус * радіус;
    }

    // 2. найменше з 3 чисел
    public static double знайтиНайменше(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    // 3. Виводить масив
    public static void вивестиМасив(int[] масив) {
        System.out.println(Arrays.toString(масив));
    }

    // 4. найбільше число з масиву
    public static int знайтиНайбільше(int[] масив) {
        int найбільше = масив[0];
        for (int число : масив) {
            if (число > найбільше) {
                найбільше = число;
            }
        }
        return найбільше;
    }
}