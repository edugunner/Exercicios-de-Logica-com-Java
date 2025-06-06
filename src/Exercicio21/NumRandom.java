package Exercicio21;

import java.util.Random;

public class NumRandom {
    public void aleatorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt();
        System.out.println(numeroAleatorio);
    }
}
