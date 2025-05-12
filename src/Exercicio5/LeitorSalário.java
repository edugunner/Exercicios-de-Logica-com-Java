package Exercicio5;

import java.util.Scanner;

public class LeitorSalário {
    //Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    //
    //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioMinimo = 1293.20;
        double salarioUsuario;

        System.out.print("Digite o valor do seu salário: R$ ");
        salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.printf("Você ganha aproximadamente %.2f salários mínimos.%n", quantidadeSalariosMinimos);

        scanner.close();

    }
}
