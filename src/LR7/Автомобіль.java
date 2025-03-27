package LR7;

public class Автомобіль {
    private String марка;
    private double потужність;
    private Водій водій;
    private double ціна;
    private int рікВипуску;

    public Автомобіль(String марка, double потужність, Водій водій, double ціна, int рікВипуску) {
        this.марка = марка;
        this.потужність = потужність;
        this.водій = водій;
        this.ціна = ціна;
        this.рікВипуску = рікВипуску;
    }

    public String отриматиМарку() {
        return марка;
    }

    public double отриматиПотужність() {
        return потужність;
    }

    public Водій отриматиВодія() {
        return водій;
    }

    public double отриматиЦіну() {
        return ціна;
    }

    public void збільшитиПотужність(double відсоток) {
        this.потужність += this.потужність * (відсоток / 100);
    }

    public void збільшитиЦіну(double відсоток) {
        this.ціна += this.ціна * (відсоток / 100);
    }

    public void змінитиВодія(Водій новийВодій) {
        this.водій = новийВодій;
    }

    @Override
    public String toString() {
        return "Авто: " + марка + ", Потужність: " + потужність + " к.с., Водій: " + водій +
                ", Ціна: " + ціна + " грн, Рік випуску: " + рікВипуску;
    }
}