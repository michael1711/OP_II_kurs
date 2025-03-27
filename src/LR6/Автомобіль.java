package LR6;

// Абстрактний клас Автомобіль
public abstract class Автомобіль {
    protected String модель;
    protected String колір;
    protected int максимальнаШвидкість;

    // Конструктор
    public Автомобіль(String модель, String колір, int максимальнаШвидкість) {
        this.модель = модель;
        this.колір = колір;
        this.максимальнаШвидкість = максимальнаШвидкість;
    }

    // Звичайний метод газу
    public void газ() {
        System.out.println("Їдемо");
    }

    // Абстрактний метод гальмування
    public abstract void гальмувати();
}

// Клас Седан
class Седан extends Автомобіль {

    public Седан(String модель, String колір, int максимальнаШвидкість) {
        super(модель, колір, максимальнаШвидкість);
    }

    @Override
    public void гальмувати() {
        System.out.println("Седан гальмує!");
    }
}

// Клас Грузовик
class Грузовик extends Автомобіль {

    public Грузовик(String модель, String колір, int максимальнаШвидкість) {
        super(модель, колір, максимальнаШвидкість);
    }

    @Override
    public void гальмувати() {
        System.out.println("Грузовик гальмує!");
    }
}
