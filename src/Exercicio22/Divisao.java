package Exercicio22;

import java.util.Scanner;

public class Divisao {
    Scanner sc = new Scanner(System.in);
    int dividendo = sc.nextInt();
    int divisor = sc.nextInt();
    int quociente;


    static {
        System.out.println("Insira os valores que serão divididos: ");
    }


    public void quociente() {
        if (this.dividendo < this.divisor) {
            System.out.println("Valores invalidos");
        } else {
            quociente = this.dividendo / this.divisor;
            System.out.println("Quociente = " + quociente);
        }
    }

    public void resto() {
        if (quociente == 0) return;
        int resto = this.dividendo % this.divisor;
        System.out.println("Resto = " + resto);

    }
}
