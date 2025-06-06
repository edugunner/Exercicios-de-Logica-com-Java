package Exericico24;

import java.util.Scanner;

public class Carro {
    private final int kmLitro = 12;

    Scanner sc = new Scanner(System.in);

    {
        System.out.println("Insira a velocidade média:");
    }
    private double velocidade = sc.nextDouble();

    {
        System.out.println("Insira o tempo gasto na viagem:");
    }
    private double tempoGasto = sc.nextDouble();

    public double distancia() {
        double distancia = tempoGasto * velocidade;
        return distancia;
    }

    public double litroGasto() {
        double litrosGastos = distancia() / kmLitro;
        return litrosGastos;
    }

    public void imprime() {
        System.out.println("A distancia percorrida foi: " + distancia());
        System.out.println("A quantidade de litros gastos foi: " + litroGasto());
    }
}
