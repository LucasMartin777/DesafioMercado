package desafioFinal.models;

public class Eletrodomesticos extends Produto{

    private int garantia;
    private int parcelas;


    public Eletrodomesticos(String nome, double valor, String descricao, int quantidade) {
        super(nome, valor, descricao, quantidade);
    }
}
