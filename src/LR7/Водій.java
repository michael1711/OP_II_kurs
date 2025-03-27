package LR7;

public class Водій {
    private String імя;
    private int вік;
    private int стаж;

    public Водій(String імя, int вік, int стаж) {
        this.імя = імя;
        this.вік = вік;
        this.стаж = стаж;
    }

    public String отриматиІмя() {
        return імя;
    }

    public int отриматиВік() {
        return вік;
    }

    public int отриматиСтаж() {
        return стаж;
    }

    public void збільшитиСтаж() {
        this.стаж++;
    }

    @Override
    public String toString() {
        return імя + " (вік: " + вік + ", стаж: " + стаж + " років)";
    }
}