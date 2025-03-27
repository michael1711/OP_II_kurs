package LR6;

public class Task3 {
    protected double обєм;
    public double отриматиОбєм() {
        return обєм;
    }
}

class ТілоОбертання extends Task3 {
    protected double радіус;
    public double отриматиРадіус() {
        return радіус;
    }
}

class Циліндр extends ТілоОбертання {
    protected double висота;
    public Циліндр(double радіус, double висота) {
        this.радіус = радіус;
        this.висота = висота;
        this.обєм = Math.PI * радіус * радіус * висота;
    }

    public double отриматиВисоту() {
        return висота;
    }
}

class Куля extends ТілоОбертання {
    public Куля(double діаметр) {
        this.радіус = діаметр / 2;
        this.обєм = (4.0 / 3.0) * Math.PI * Math.pow(радіус, 3);
    }
    public double отриматиДіаметр() {
        return радіус * 2;
    }
}

class Піраміда extends Task3 {
    protected double площа_основи;
    protected double висота;
    public Піраміда(double площа_основи, double висота) {
        this.площа_основи = площа_основи;
        this.висота = висота;
        this.обєм = (1.0 / 3.0) * площа_основи * висота;
    }

    public double отриматиПлощуОснови() {
        return площа_основи;
    }

    public double отриматиВисоту() {
        return висота;
    }
}