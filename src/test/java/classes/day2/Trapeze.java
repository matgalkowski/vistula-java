package classes.day2;

/**
 * Created by Galek on 04.12.2016.
 */
public class Trapeze {
    private int a, b, h;

    public Trapeze(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;

    }

    public int field () {
        return (this.a + this.b) * this.h;
    }
}
