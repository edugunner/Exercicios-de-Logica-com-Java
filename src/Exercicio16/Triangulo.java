package Exercicio16;


import java.util.Scanner;

public class Triangulo {
    Scanner sc = new Scanner(System.in);

    private int ladoA = sc.nextInt();
    private int ladoB = sc.nextInt();
    private int ladoC = sc.nextInt();


    static {
        System.out.println("Insira os lados dos triangulos");
    }



    public boolean ehTriangulo() {
        boolean result;
        if (this.ladoA + this.ladoB < ladoC) {

            result = false;
        } else if (this.ladoB + this.ladoC < this.ladoA) {

            result = false;
        } else if (this.ladoC + this.ladoA < this.ladoB) {

            result = false;
        } else {

            result = true;
        }
        return result;
    }


    public String tipoTriangulo() {
        String resultado;
        if(this.ladoA != this.ladoB && this.ladoB != this.ladoC && this.ladoA != this.ladoC) {
            resultado = "Escaleno.";
            return resultado;
        } else if (this.ladoA == this.ladoB && this.ladoB == this.ladoC) {
            resultado = "Equilátero.";
            return resultado;
        } else {
            resultado = "Isósceles.";
            return resultado;
        }
    }

    public void Resultado() {

        if (ehTriangulo() == true) {
            System.out.println("É um triangulo, do tipo " + tipoTriangulo());
            System.out.println("Lados: " +ladoA + ", " + ladoB + ", " + ladoC);
        } else {
            System.out.println("Não é um triangulo. ");
        }

    }

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo() {

    }


}
