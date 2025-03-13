package LR1;

public class task2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    public task2 (String a, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    public String get_rech() {
        return String.format("%s %s %s %s %s %s %s %s %s %s", a, b, c, d, e, f, g, h, i, j);
    }
}
