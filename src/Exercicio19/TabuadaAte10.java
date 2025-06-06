package Exercicio19;

public class TabuadaAte10 {
    public void calculaTabuada() {
        //Faça um algoritmo que imprima na tela a tabuada de 1 até 10
        int[] multiplicador = {1,2,3,4,5,6,7,8,9,10};
        int[] multiplicando = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


        for (int i = 0; i < multiplicador.length; i++) {
            System.out.println("-------");
            for (int j = 0; j < multiplicando.length; j++) {
                int resultado = multiplicando[j] * multiplicador[i];
                System.out.println(multiplicando[j] + "x" + multiplicador[i] + "=" +resultado);
            }

        }
    }
}
