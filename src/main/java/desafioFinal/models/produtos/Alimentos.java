package desafioFinal.models.produtos;


import java.util.Objects;

public class Alimentos extends Produto {
    private String validade;
    private double peso;


    public Alimentos(String tipoProduto, String nomeProduto, double valor, String descricao, int quantidade, String validade, double peso) {
        super(tipoProduto, nomeProduto, valor, descricao, quantidade);
        this.validade = validade;
        this.peso = peso;


    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Alimentos that = (Alimentos) obj;
        return Objects.equals(getTipoProduto(), that.getTipoProduto());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTipoProduto());
    }

    @Override
    public String toString() {
        return "\nTipo do Produto: " + getTipoProduto() +
                ", Nome: " + getnomeProduto() +
                ", Valor: " + getValor() +
                ", Descrição: " + getDescricao() +
                ", Quantidade: " + getQuantidade() +
                ", Validade: " + validade +
                ", Peso: " + peso + "kg";
    }


}
