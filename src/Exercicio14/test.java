package Exercicio14;

public class test {
    //Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
    public static void main(String[] args) {
        Valores valores = new Valores(15,20);
        valores.setTemp(valores.getB());
        System.out.println("Valores originais: " + "A = " + valores.getA() + " B = " +valores.getB());
        valores.setB(valores.getA());
        valores.setA(valores.getTemp());
        System.out.println("Valores trocados: " + "A = " + valores.getA() + " B = " +valores.getB());



    }
}
