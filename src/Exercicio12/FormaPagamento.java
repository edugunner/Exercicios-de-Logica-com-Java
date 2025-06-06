package Exercicio12;

public enum FormaPagamento {
    CREDITO(1) {
        @Override
        public double calcularValorFinal(double valorTotal) {
            return valorTotal - valorTotal * 0.10; 
        }
    },
    DINHEIROPIX(2) {
        @Override
        public double calcularValorFinal(double valorTotal) {
            return valorTotal - valorTotal * 0.15;
        }
    },
    PARCELADO2X(3) {
        @Override
        public double calcularValorFinal(double valorTotal) {
            return valorTotal;
        }
    },
    PARCELADO3X(4) {
        @Override
        public double calcularValorFinal(double valorTotal) {
            return valorTotal + valorTotal * 0.10;
        }
    };

    private final int codigo;

    FormaPagamento(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public abstract double calcularValorFinal(double valorTotal);
}