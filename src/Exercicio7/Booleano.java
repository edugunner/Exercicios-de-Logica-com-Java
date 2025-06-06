package Exercicio7;

import java.util.Scanner;

public class Booleano {
    //Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valor1;
        boolean valor2;
        System.out.println("Digite true para verdadeiro ou false para falso");
        valor1 = sc.nextBoolean();
        System.out.println("Digite true para verdadeiro ou false para falso");
        valor2 = sc.nextBoolean();
        if (valor1 && valor2) {
            System.out.println("Ambos os valores são VERDADEIRO.");
        }  else  {
            System.out.println("Pelo menos um dos valores é FALSO");
        }
    }
}
