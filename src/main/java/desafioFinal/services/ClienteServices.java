package desafioFinal.services;

import desafioFinal.models.usuarios.Cliente;

public class ClienteServices {

    private Cliente cliente;






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
