package LR6;

public class Main {
    public static void main(String[] args) {

        System.out.println("Завдання 1:");
        Person person1 = new Person();
        Person person2 = new Person("Іван Іванов", 30);
        person2.talk();
        person2.move();

        System.out.println("\nЗавдання 2:");
        Phone phone1 = new Phone("096-535-4811", "Xiaomi", 200);
        Phone phone2 = new Phone("066-157-1488", "iPhone", 180);
        Phone phone3 = new Phone("050-255-1024", "Sonny Ericsson");

        System.out.println("Телефон 1: " + phone1.number + ", " + phone1.model + ", " + phone1.weight);
        System.out.println("Телефон 2: " + phone2.number + ", " + phone2.model + ", " + phone2.weight);
        System.out.println("Телефон 3: " + phone3.number + ", " + phone3.model);

        phone1.receiveCall("Олександр");
        phone2.receiveCall("Марія", "098-007-513");

        System.out.println("Номер телефону 1: " + phone1.getNumber());
        System.out.println("Номер телефону 2: " + phone2.getNumber());

        phone1.sendMessage("123-456-789", "987-654-321", "555-666-777");

        System.out.println("\nЗавдання 3:");
        // Створення об'єктів різних форм
        Куля куля = new Куля(10);  // Діаметр = 10
        Циліндр циліндр = new Циліндр(5, 12); // Радіус = 5, Висота = 12
        Піраміда піраміда = new Піраміда(20, 15); // Площа основи = 20, Висота = 15

        // Виведення інформації про об'єкти
        System.out.println("Куля:");
        System.out.println("Радіус: " + куля.отриматиРадіус());
        System.out.println("Діаметр: " + куля.отриматиДіаметр());
        System.out.println("Об'єм: " + куля.отриматиОбєм());

        System.out.println("\nЦиліндр:");
        System.out.println("Радіус: " + циліндр.отриматиРадіус());
        System.out.println("Висота: " + циліндр.отриматиВисоту());
        System.out.println("Об'єм: " + циліндр.отриматиОбєм());

        System.out.println("\nПіраміда:");
        System.out.println("Площа основи: " + піраміда.отриматиПлощуОснови());
        System.out.println("Висота: " + піраміда.отриматиВисоту());
        System.out.println("Об'єм: " + піраміда.отриматиОбєм());

        System.out.println("\nЗадвання 4:");
        // Створення об'єктів Седан та Грузовик
        Автомобіль седан = new Седан("Volvo", "Червоний", 200);
        Автомобіль грузовик = new Грузовик("Камаз", "Помаранчевий", 80);

        // Методи
        седан.газ();
        седан.гальмувати();
        грузовик.газ();
        грузовик.гальмувати();

        System.out.println("\nЗавдання 5:");
        Багаж багаж = new Багаж();
        багаж.ввестиДані();
        багаж.вивестиЗагальнуВагу();
    }
}