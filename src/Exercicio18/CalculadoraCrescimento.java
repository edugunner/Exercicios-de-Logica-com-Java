package Exercicio18;

public class CalculadoraCrescimento {

    //Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano.
    // Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.
    public static void main(String[] args) {
        Pessoa francisco = new Pessoa(1.50,0.02);
        Pessoa sara = new Pessoa(1.10,0.03);

        int anos = 0;

        while (sara.getAltura() <= francisco.getAltura()) {
            francisco.crescer();
            sara.crescer();
            anos++;
        }

        System.out.println("Serão necessarios " + anos + " anos para que Sara seja maior que Francisco");
    }
}
