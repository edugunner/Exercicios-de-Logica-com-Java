package Exercicio15;

public class DiasVivo {
    // Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
    //
    //consideração o ano com 365 dias e o mês com 30 dias.
    //
    //(Ex: 5 anos, 2 meses e 15 dias de vida)
    public static void main(String[] args) {
        //Dias Vividos
        int anos = 19;
        int diasNoAno = 365;
        double diasVivo = anos * diasNoAno;

        //Horas Vividas
        // dias vividos * 24
        int horasDoDia = 24;
        double horasVivo = horasDoDia * diasVivo;

        //Minutos Vividos
        int minutosHora = 60;
        int minutosDia = minutosHora * 24;
        double minutosVivo = minutosDia * diasVivo;
        System.out.println("Estou vivo a " + diasVivo + " dias, " + horasVivo + " horas e " + minutosVivo + " minutos. ");
    }
}



