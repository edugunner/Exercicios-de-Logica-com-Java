package Exercicio2;

import java.util.Scanner;

public class VerificaParOuImpar {
    // Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num = sc.nextInt();
        String verificador = String.valueOf(num);
        char primeiroDigito = verificador.charAt(0);
        if (num % 2 == 0 && primeiroDigito == '-') {
            System.out.println("Número Par e Negativo");
        }
        else if (num % 2 == 0) {
            System.out.println("Número Par e Positivo");
        }
        else if (num % 2 != 0 && primeiroDigito == '-') {
            System.out.println("Número Impar e Negativo");
        }
        else {
            System.out.println("Número Impar e Positivo");
        }
    }
}
