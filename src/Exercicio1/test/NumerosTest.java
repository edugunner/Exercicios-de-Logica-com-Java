package Exercicio1.test;

import Exercicio1.dominio.Numeros;

public class NumerosTest {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(5, 6, 5);
        if (numeros.getA() + numeros.getB() < numeros.getC()) {
            System.out.println("Menor que C");
        }else {
            System.out.println("Maior que C");
        }
    }
}
