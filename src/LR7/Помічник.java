package LR7;

import java.util.List;
import java.util.Random;

public class Помічник {
    public static Автомобіль випадковеТаксі(List<Автомобіль> автопарк) {
        Random random = new Random();
        int індекс = random.nextInt(автопарк.size());
        Автомобіль вибранеАвто = автопарк.get(індекс);
        System.out.println("Автомобіль марки " + вибранеАвто.отриматиМарку() + " з водієм " + вибранеАвто.отриматиВодія().отриматиІмя() + " виїхав за вами.");
        return вибранеАвто;
    }

    public static void таксіПрибуло(Автомобіль авто) {
        System.out.println("Водій " + авто.отриматиВодія().отриматиІмя() + " прибув на місце.");
    }
}