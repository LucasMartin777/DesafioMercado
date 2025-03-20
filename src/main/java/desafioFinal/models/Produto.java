package desafioFinal.models;

public class Produto {
    private String nome;
    private double valor;
    private String descricao;     // descricao do produto se o cara quiser ver
    private int quantidade;
    private static int totalNoCarrinho = 0;

    public Produto(String nome, double valor, String descricao, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidade = quantidade;
        totalNoCarrinho += quantidade;
    }

    public static int getTotalNoCarrinho() {
        return totalNoCarrinho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
