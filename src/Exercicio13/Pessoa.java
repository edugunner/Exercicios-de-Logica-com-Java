package Exercicio13;

public class Pessoa {
    private String nome;
    private int idade;

    public String seMaior18() {
        if(idade >= 18) {
            System.out.println(this.nome + " é maior de idade ");
        } else {
            System.out.println(this.nome + " é menor de idade ");
        }
        return "--------";
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
