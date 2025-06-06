package Exercicio18;

public class Pessoa {
    private double altura;
    private double crescimentoAnual;

    public Pessoa(double altura, double crescimentoAnual) {
        this.altura = altura;
        this.crescimentoAnual = crescimentoAnual;
    }

    public double getAltura() {
        return altura;
    }

    public void crescer() {
        this.altura += crescimentoAnual;
    }
}
