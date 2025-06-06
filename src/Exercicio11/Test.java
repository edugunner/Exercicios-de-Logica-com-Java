package Exercicio11;

public class Test {

    //Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
    //
    // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João");
        int[] notas = {5,10,10,5};
        aluno.setNotas(notas);
        if (aluno.CalculaMedia() < 7) {
            System.out.println("Infelizmente você foi reprovado. Sua nota foi:  " + aluno.CalculaMedia());
        } else {
            System.out.println("Você foi aprovado. Sua nota foi:  " + aluno.CalculaMedia());

        }

    }
}
