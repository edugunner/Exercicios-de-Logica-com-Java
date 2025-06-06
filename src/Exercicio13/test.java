package Exercicio13;

public class test {
    //Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 17);
        Pessoa pessoa1 = new Pessoa("Flávia", 19);
        System.out.println(pessoa.seMaior18());
        System.out.println(pessoa1.seMaior18());

    }
}
