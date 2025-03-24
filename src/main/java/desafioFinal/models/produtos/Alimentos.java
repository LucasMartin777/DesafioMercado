package desafioFinal.models.produtos;


public class Alimentos extends Produto {
    private String validade;
    private double peso;

    public String getValidade() {
        return validade;
    }

    public double getPeso() {
        return peso;
    }

    public Alimentos(String tipoProduto, String nomeProduto, double valor, String descricao, int quantidade, String validade, double peso) {
        super(tipoProduto, nomeProduto, valor, descricao, quantidade);
        this.validade = validade;
        this.peso = peso;
    }


}
