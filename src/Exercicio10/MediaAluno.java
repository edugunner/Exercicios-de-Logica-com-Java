package Exercicio10;

import java.util.Scanner;

public class MediaAluno {
    // 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int qtdNotas = 3;
        double nota1;
        double nota2;
        double nota3;

        System.out.println("Insira a primeira nota: ");
        nota1 = sc2.nextDouble();
        System.out.println("Insira a segunda nota: ");
        nota2 = sc2.nextDouble();
        System.out.println("Insira a terceira nota: ");
        nota3 = sc2.nextDouble();

        double media = nota1 + nota2 + nota3;
        media = media /qtdNotas;
        String resultado = String.format("%.2f", media);
        System.out.println(resultado);
        sc2.close();
    }
}
