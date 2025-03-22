package desafioFinal.models.produtos;

public class Produto implements Comparable<Produto> {
    private String tipoProduto;
    private String nomeProduto;
    private double valor;
    private String descricao;     // descricao do produto se o cara quiser ver
    private int quantidade;



    public Produto(String tipoProduto, String nomeProduto, double valor, String descricao, int quantidade) {
        this.tipoProduto = tipoProduto;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidade = quantidade;

    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }



    public String getnomeProduto() {
        return nomeProduto;
    }

    public void setnomeProduto(String nome) {
        this.nomeProduto = nomeProduto;
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


    @Override
    public int compareTo(Produto outroProduto) {
        return this.getTipoProduto().compareTo(outroProduto.getTipoProduto());
    }
}
