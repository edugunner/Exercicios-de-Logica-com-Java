package Exercicio6;

import java.util.Scanner;

public class Reajuste5 {
    //Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.println("Insira o valor: ");
        valor = sc.nextDouble();
        double porcentagem;
        porcentagem = valor * 0.05;
        double reajuste = valor + porcentagem;

        System.out.println("Valor reajustado: "+ reajuste);
    }
}
