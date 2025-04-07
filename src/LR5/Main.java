package LR5;

public class Main {
    public static void main(String[] args) {

        double радіус = 5;
        System.out.println("Задвання 1:");
        System.out.println("Площа кола: " + Завдання.обчислПлощуКола(радіус));

        double a = 12, b = 5, c = 8;
        System.out.println("\nЗавдання 2:");
        System.out.println("Найменше число з 3-х: " + Завдання.знайтиНайменше(a, b, c));

        int[] масив1 = {3, 7, 1, 9, 2};
        System.out.println("\nЗавдання 3:");
        System.out.print("Масив: ");
        Завдання.вивестиМасив(масив1);

        System.out.println("\nЗавдання 4:");
        System.out.println("Найбільше число з масиву: " + Завдання.знайтиНайбільше(масив1));
    }
}
