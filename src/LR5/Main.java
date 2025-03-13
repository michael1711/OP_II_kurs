package LR5;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1 math = new task1(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Завдання 1:");
        System.out.println("Додавання " + math.dodavanya());
        System.out.println("Віднімання " + math.vidnimanya());
        System.out.println("Множення " + math.mnozhennya());
        System.out.println("Ділення " + math.dilenya());
        System.out.println(" ");

        task2 rech = new task2("Речення", "це", "граматична","конструкція","побудована","з","одного","чи","кількох","слів");
        System.out.println("Завдання 2:");
        System.out.println(rech.get_rech());
        System.out.println(" ");

        task3[] users = {
                new task3(1, 25, "Іван", "Петров", 70.5, 175.0),
                new task3(2, 30, "Марія", "Іванова", 60.0, 165.0),
                new task3(3, 22, "Олександр", "Сидоренко", 80.2, 180.0),
                new task3(4, 27, "Анна", "Коваленко", 55.3, 160.0),
                new task3(5, 35, "Дмитро", "Гриненко", 90.1, 185.0),
                new task3(6, 40, "Олена", "Лисенко", 65.8, 170.0),
                new task3(7, 33, "Павло", "Шевченко", 78.6, 178.0),
                new task3(8, 29, "Катерина", "Мельник", 58.4, 162.0),
                new task3(9, 31, "Артем", "Василенко", 85.0, 182.0),
                new task3(10, 26, "Наталя", "Бойко", 52.7, 158.0)
        };
        int totAge = 0;
        float totWei = 0;
        float totHei = 0;
        for (task3 user : users) {
            totAge += user.age;
            totWei += user.weight;
            totHei += user.height;
        }
        System.out.println("Завдання 3:");
        System.out.println("Доданий вік: " + totAge);
        System.out.println("Доданий вага: " + totWei);
        System.out.println("Доданий зріст: " + totHei);
        System.out.println(" ");

        task4[] cars = {
            new task4(32, 1035, "Audi", 16, 150, 5, 1800),
            new task4(300, 3000, "Nissan", 15, 80, 2, 1500),
            new task4(80, 1200, "Жигулі", 13, 300, 5, 1300),
            new task4(100, 500, "VolksWagen", 14, 120, 5, 2000),
            new task4(200, 200, "Smart", 10, 120, 2, 940),
            new task4(500, 6500, "VolksWagen", 17, 150, 2, 1800),
            new task4(600, 3000, "Chevrolet", 20, 480, 5, 3300),
            new task4(880, 8030, "Камаз", 23, 300, 3, 2800),
            new task4(30, 120, "Bajaj", 14, 100, 2, 200),
            new task4(180, 560, "Запорожець", 12, 120, 28, 850),
        };
        int totEngineVol = 0;
        int totHP = 0;
        for (task4 car : cars) {
            totEngineVol += car.engineVol;
            totHP += car.horsepower;
        }
        System.out.println("Завдання 4:");
        System.out.println("Доданий обєм двигуна: " + totEngineVol);
        System.out.println("Доданий кінські сили: " + totHP);
        System.out.println("");

        int a = 12345;
        System.out.println("Завдання 5:");
        System.out.println(task5.rev(a));
    }
}