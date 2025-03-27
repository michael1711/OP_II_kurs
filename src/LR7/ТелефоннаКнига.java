package LR7;

import java.util.HashMap;
import java.util.Map;

public class ТелефоннаКнига {
    private HashMap<String, Контакт> книга;

    public ТелефоннаКнига() {
        книга = new HashMap<>();
    }

    public void додатиКонтакт(String прізвище, String номер) {
        книга.put(прізвище, new Контакт(прізвище, номер));
    }

    public void знайтиКонтакт(String прізвище) {
        if (книга.containsKey(прізвище)) {
            System.out.println("Номер для " + прізвище + ": " + книга.get(прізвище).отриматиНомер());
        } else {
            System.out.println("У книзі відсутній такий абонент.");
        }
    }

    public void видалитиКонтакт(String прізвище) {
        книга.remove(прізвище);
        System.out.println("Абонент " + прізвище + " видалений.");
    }

    public boolean перевіритиПрізвище(String прізвище) {
        return книга.containsKey(прізвище);
    }

    public boolean перевіритиНомер(String номер) {
        return книга.containsValue(new Контакт("", номер));
    }

    public int отриматиРозмір() {
        return книга.size();
    }

    public void вивестиКнигу() {
        System.out.println("Телефонна книга:");
        for (Map.Entry<String, Контакт> запис : книга.entrySet()) {
            System.out.println(запис.getValue());
        }
    }
}