package desafioFinal.services;

import desafioFinal.models.carrinhos.Carrinho;
import desafioFinal.models.usuarios.Cliente;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompraServices {
    static private List<Carrinho> totalCarrinho = new ArrayList<>();
    static private double valorTotalDaCompra;


    public static void produtosNoCarrinho(Carrinho carrinho) {
        totalCarrinho.add(carrinho);
        valorTotalDaCompra += carrinho.getValorProduto();


    }

    public static double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

    public List<Carrinho> getTotalCarrinho() {
        return totalCarrinho;
    }

    public static void pagarContaAVista(Cliente cliente) {
        double pagamento = cliente.getValorEmconta() - valorTotalDaCompra;
        System.out.println("Pagando a vista");
        if (pagamento < 0) {
            System.out.println("Cartao recusado, deseja parcelar?");
        } else {
            System.out.println("Pagamento realizado com sucesso! " + pagamento);
            System.out.println("Fatura : " + pagamento);
        }

    }


}
