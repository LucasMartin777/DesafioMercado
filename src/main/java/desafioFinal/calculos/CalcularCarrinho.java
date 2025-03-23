package desafioFinal.calculos;

public class CalcularCarrinho {

    public void pagamentoFinal(double saldoEmConta,double valorTotalDaCompra){
        double total = saldoEmConta - valorTotalDaCompra;
        if (total < 0){
            System.out.println("Saldo insuficiente");
        }else{

        }
    }

}
