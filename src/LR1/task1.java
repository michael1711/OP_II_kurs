package LR1;

public class task1 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    public task1(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
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

    public int dodavanya() {
        return a+b+c+d+e+f+g+h+i+j;
    }

    public int vidnimanya() {
        return a-b-c-d-e-f-g-h-i-j;
    }

    public float mnozhennya() {
        return a*b*c*d*e*f*g*h*i*j;
    }

    public float dilenya() {
        return a/b/c/d/e/f/g/h/j;
    }
}