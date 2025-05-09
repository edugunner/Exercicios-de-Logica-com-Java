package Exercicio3;

import java.util.Scanner;

public class VerficaSomaOuMultiplicacao {
    //Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
    //
    //caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
    //
    //imprimir seu valor na tela.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        int b = sc.nextInt();
        if (a == b) {
           int c = a + b;
            System.out.println(c);
        } else {
            double c = a * b;
            System.out.println(c);
        }
    }
}
