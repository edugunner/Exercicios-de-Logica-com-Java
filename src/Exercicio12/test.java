package Exercicio12;

public class test {

    //Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
    //
    // pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
    //
    //
    //
    // Tabela de Código de Condições de Pagamento
    //
    //
    //
    // 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
    //
    // 2 - À Vista no cartão de crédito, recebe 10% de desconto
    //
    // 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
    //
    // 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setValor(5000.0);
        produto1.setNome("Computador");
        FormaPagamento formaPagamentoSelecionada;

        // Exemplo de como selecionar uma forma de pagamento
        formaPagamentoSelecionada = FormaPagamento.PARCELADO3X;

        double valorFinal = formaPagamentoSelecionada.calcularValorFinal(produto1.getValor());

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Valor original: " + produto1.getValor());
        System.out.println("Forma de pagamento selecionada: " + formaPagamentoSelecionada);
        System.out.println("Valor final com desconto: " + valorFinal);
    }
}