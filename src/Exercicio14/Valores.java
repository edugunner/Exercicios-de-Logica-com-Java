package Exercicio14;

public class Valores {
    private int a;
    private int b;
    private int temp;

    public Valores(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Valores{" +
                "b=" + b +
                ", a=" + a +
                '}';
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
