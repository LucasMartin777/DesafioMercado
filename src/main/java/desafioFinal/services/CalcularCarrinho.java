package desafioFinal.services;

public class CalcularCarrinho {

    public double pagamentoFinal(double saldoEmConta, double valorTotalDaCompra) {
        double total = saldoEmConta - valorTotalDaCompra;
        if (total < 0) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Realizando o pagamento");
        }
        return total;
    }

}
