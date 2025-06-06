package Exercicio9;

import java.util.Scanner;

public class CalculadoraIMC {
  //Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
    //
    //de acordo com a tabela abaixo:
    //
    //Fórmula do IMC = peso / (altura) ²
    //
    //Tabela Condições IMC
    //
    //
    //
    // Abaixo de 18,5   | Abaixo do peso
    //
    // Entre 18,6 e 24,9 | Peso ideal (parabéns)
    //
    // Entre 25,0 e 29,9 | Levemente acima do peso
    //
    // Entre 30,0 e 34,9 | Obesidade grau I
    //
    // Entre 35,0 e 39,9 | Obesidade grau II (severa)
    //
    // Maior ou igual a 40 | Obesidade grau III (mórbida)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso;
        double altura;
        System.out.println("Insira seu peso:");
        peso = sc.nextDouble();
        System.out.println("Insira sua altura: ");
        altura = sc.nextDouble();

        double imc = peso / (altura * 2);
        String resultado = String.format("%.2f", imc);


        if (imc <= 18.5) {
            System.out.println("Seu imc é " + resultado + " |Abaixo do peso");
        }
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu imc é " + resultado + " |Peso ideal");
        }
        if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Seu imc é " + resultado + " |Levemente acima do peso");
        }
        if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Seu imc é " + resultado + " |Obesidade grau I ");
        }
        if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Seu imc é " + resultado + " |Obesidade grau II (severa)");
        }
        if (imc >= 40.0) {
            System.out.println("Seu imc é " + resultado + " |Obesidade grau III (mórbida) ");

        }
    }
}

