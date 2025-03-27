package desafioFinal.models.usuarios;

import desafioFinal.models.produtos.Produto;

import java.util.List;

public class Cliente extends Usuario {
    private double valorEmConta;
    private List<Produto> produtos;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente(String nomeUsuario, String senhaUsuario, double valorEmConta) {
        super(nomeUsuario, senhaUsuario);
        this.valorEmConta = valorEmConta;
    }

    public double getValorEmconta() {
        return valorEmConta;
    }

    public void setValorEmconta(double valorEmconta) {
        this.valorEmConta = valorEmconta;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "valorEmConta=" + valorEmConta +
                ", Nome de Usuário='" + getNomeUsuario() + '\'' +
                ", Senha de Usuário='" + getSenhaUsuario() + '\'' +
                "}\n";
    }


}

