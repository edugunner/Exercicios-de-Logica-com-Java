package Exercicio4;

import java.util.Scanner;

public class AntecessorESucessor {
    //Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número ");
        int num = sc.nextInt();
        System.out.println("Número: " + num);
        num = num -1;
        System.out.println("Antecessor: " + num);
        num = num + 2;
        System.out.println("Sucessor: " + num);
    }
}
