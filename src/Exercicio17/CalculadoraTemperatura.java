package Exercicio17;

import java.util.Scanner;

public class CalculadoraTemperatura {
    public double tempF() {
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        return fahrenheit;
    }

    public String tempC() {
        double tempC = 5 * (this.tempF() - 32) / 9;
        String resultado = String.format("%.2f", tempC);
        return resultado;
    }
    public void calculadora() {
        System.out.println("Insira a temperatura em Fahrenheit: ");
        System.out.println("A temperatura em Fahrenheit é: " +this.tempF() + "º, que corresponde a " +this.tempC() + "Cº");


    }
}