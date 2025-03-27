package LR6;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone() { // конструктор без параметрів
    }

    public Phone(String number, String model) { // конструктор з 2 параметрами
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) { // конструктор з 3 параметрами
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    void receiveCall(String callerName, String callerNumber) { // перевантажений метод
        System.out.println("Дзвонить " + callerName + " (" + callerNumber + ")");
    }

    String getNumber() {
        return number;
    } // метод getNumber

    void sendMessage(String... phoneNumbers) { // Метод sendMessage з аргументами змінної довжини
        System.out.println("Повідомлення відправлено на номери: ");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}