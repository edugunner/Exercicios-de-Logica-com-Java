package Exercicio20;

import java.util.Scanner;

public class Calculadora {
    public void tabuada() {
        int[] multiplicador = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o numero que será multiplicado até o 10");
        int num = sc.nextInt();
        System.out.println("Tabuada do " + num);
        for (int i = 0; i <multiplicador.length ; i++) {
            int resultado = num * multiplicador[i];

            System.out.println(num + "x" + multiplicador[i] + "=" +resultado);
        }
    }
}
