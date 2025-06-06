package Exercicio23;

import java.util.Scanner;

public class Professor {
    Scanner sc = new Scanner(System.in);

    {
        System.out.println("Insira o valor da hora aula:");
    }

    private double valorHoraAula = Double.parseDouble(sc.next());

    {
        System.out.println("Insira a quantidade de aulas lecionadas no mês: ");
    }
    private int aulasLecionadas = sc.nextInt();

    private double salarioLiquido;
    double salarioBruto;
    public double calculaSalarioBruto() {

        salarioBruto = valorHoraAula * aulasLecionadas;
        return salarioBruto;
    }

    public double calculaTaxaInss(double salarioBruto) {
        double taxaInss = 0;
        if (salarioBruto <= 1519.00) { // Faixa salarial mais baixa (exemplo de taxa 7.5%)
            taxaInss = 0.075;
        } else if (salarioBruto > 1519.00 && salarioBruto <= 2793.00) {
            taxaInss = 0.09;
        } else if (salarioBruto > 2793.00 && salarioBruto <= 4190.00) {
            taxaInss = 0.12;
        } else {
            taxaInss = 0.14;
        }
        return taxaInss;
    }



    public void salarioLiquido() {
        salarioLiquido = calculaSalarioBruto() -  calculaSalarioBruto() * calculaTaxaInss(salarioBruto);
        String resultado = String.format("%.2f", salarioLiquido);
        String resultadoSalarioBruto = String.format("%.2f", calculaSalarioBruto());
        System.out.print("O salario bruto é: " + resultadoSalarioBruto);
        System.out.println(" e o salario liquido é " + resultado);
        System.out.println("Taxa INSS = " + calculaTaxaInss(salarioBruto));
    }

}
