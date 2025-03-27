package LR7;

public class Контакт {
    private String прізвище;
    private String номер;

    public Контакт(String прізвище, String номер) {
        this.прізвище = прізвище;
        this.номер = номер;
    }

    public String отриматиНомер() {
        return номер;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Контакт контакт = (Контакт) obj;
        return номер.equals(контакт.номер);
    }

    @Override
    public int hashCode() {
        return номер.hashCode();
    }

    @Override
    public String toString() {
        return прізвище + " -> " + номер;
    }
}