package Exercicio8;


import java.util.Arrays;

public class Descrescente {
    // Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

    public static void main(String[] args) {
        int vet[] = {11, 4, 8, 10};
        for (int i = 0; i < vet.length; i++) {

            vet[i] = -vet[i];
        }

        Arrays.sort(vet);

        for (int i = 0; i < vet.length; i++) {

            vet[i] = -vet[i];
            System.out.println(vet[i]);
        }
    }
}
