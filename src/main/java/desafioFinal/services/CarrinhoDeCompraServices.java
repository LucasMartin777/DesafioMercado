package desafioFinal.services;

import desafioFinal.models.carrinhos.Carrinho;
import desafioFinal.models.usuarios.Cliente;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompraServices {
    static private List<Carrinho> totalCarrinho = new ArrayList<>();
    static private double valorTotalDaCompra;


    public void produtosNoCarrinho(Carrinho carrinho) {
        totalCarrinho.add(carrinho);
        valorTotalDaCompra += carrinho.getValorProduto();


    }

    public List<Carrinho> getTotalCarrinho() {
        return totalCarrinho;
    }

    public void pagarContaAVista(Cliente cliente) {
        double pagamento = cliente.getValorEmconta() - valorTotalDaCompra;
        if (pagamento < 0) {
            System.out.println("Cartao recusado, deseja parcelar?");
        } else {
            System.out.println("Pagamento realizado com sucesso, volte sempre : " + pagamento);
        }

    }


}
