package desafioFinal.models.produtos;

import java.util.Objects;

public class Eletrodomesticos extends Produto {


    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public Eletrodomesticos(String tipoProduto, String marca, String nomeProduto, double valor, String descricao, int quantidade) {
        super(tipoProduto, nomeProduto, valor, descricao, quantidade);
        this.marca = marca;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Eletrodomesticos that = (Eletrodomesticos) obj;
        return Objects.equals(getTipoProduto(), that.getTipoProduto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTipoProduto());
    }

    @Override

    public String toString() {
        return "Tipo do Produto: " + getTipoProduto() +
                ", Marca: " + marca +
                ", Nome: " + getnomeProduto() +
                ", Valor: " + getValor() +
                ", Descrição: " + getDescricao() +
                ", Quantidade: " + getQuantidade() + "\n";
    }

}

