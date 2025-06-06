package Exercicio11;

public class Aluno {
    private String nome;
    private int[] notas = new int[4];

    public double CalculaMedia() {
        double somaNotas = 0;
        for (int nota : notas) {
            somaNotas += nota;
        }
        double media;
        media = somaNotas / notas.length;
        return media;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
}