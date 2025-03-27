package LR6;

public class Person {
    String fullName;
    int age;

    public Person() { // конструктор без параметрів
    }

    public Person(String fullName, int age) { // конструктор з параметрами
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(fullName + " рухається");
    }
        void talk() {
        System.out.println(fullName + " говорить");
    }
}