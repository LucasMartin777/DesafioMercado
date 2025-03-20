package desafioFinal.models;

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

    public String toString() {
        return "Tipo do Produto: " + getTipoProduto() +
                ", Marca: " + marca +
                ", Nome: " + getnomeProduto() +
                ", Valor: " + getValor() +
                ", Descrição: " + getDescricao() +
                ", Quantidade: " + getQuantidade() + "\n";
    }

}

